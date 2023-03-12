package lk.klass;

import lk.klass.dtos.CreateProjectRequest;
import lk.klass.dtos.GetProjectsResponse;
import lk.klass.dtos.UploadVideoResponse;
import lk.klass.dtos.GetVideosResponse;
import lk.klass.models.Video;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.http.codec.multipart.FilePart;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.time.Duration;

/**
 * @author danushka
 * 2023-03-12
 */
public class DyntubeVideoService {
    private final WebClient webClient;
    private final String token;

    public DyntubeVideoService(String token) {
        this.token = token;
        String endPoint = "https://api.dyntube.com/v1/";
        webClient = WebClient.builder()
                .baseUrl(endPoint)
                .defaultHeader(HttpHeaders.AUTHORIZATION, "bearer" + " " + token)
                .build();
    }

    public Mono<UploadVideoResponse> uploadVideo(FilePart file) {
        return WebClient.builder()
                .baseUrl("https://upload.dyntube.com/v1/videos")
                .defaultHeader(HttpHeaders.AUTHORIZATION, "bearer" + " " + token)
                .build()
                .post()
                .contentType(MediaType.MULTIPART_FORM_DATA)
                .body(BodyInserters.fromMultipartData(fromFile(file)))
                .retrieve().bodyToMono(UploadVideoResponse.class)
                .retryWhen(Retry.backoff(3, Duration.ofSeconds(2)).jitter(0.75));
    }

    public Mono<Video> getVideo(String videoId) {
        return webClient
                .get()
                .uri(String.format("videos/%s", videoId))
                .retrieve()
                .bodyToMono(Video.class);
    }

    public Mono<GetVideosResponse> getVideos() {
        return webClient
                .get()
                .uri("videos")
                .retrieve()
                .bodyToMono(GetVideosResponse.class);
    }

    public Mono<GetProjectsResponse> getProjects() {
        return webClient
                .get()
                .uri("projects")
                .retrieve()
                .bodyToMono(GetProjectsResponse.class);
    }

    public Mono<String> createProject(CreateProjectRequest request) {
        return webClient
                .post()
                .uri("projects")
                .body(BodyInserters.fromValue(request))
                .retrieve()
                .bodyToMono(String.class);
    }

    private MultiValueMap<String, HttpEntity<?>> fromFile(FilePart file) {
        MultipartBodyBuilder builder = new MultipartBodyBuilder();
        builder.part("file", file);
        return builder.build();
    }

}
