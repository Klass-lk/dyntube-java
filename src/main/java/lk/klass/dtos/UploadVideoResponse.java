package lk.klass.dtos;

import lombok.Data;

/**
 * @author danushka
 * 2023-03-12
 */
@Data
public final class UploadVideoResponse {
    public String videoKey;
    public String uploadId;
    public String videoId;
    public String channelKey;
    public String privateLink;
    public String iframeLink;
}
