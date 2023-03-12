package lk.klass.dtos;

import lk.klass.models.Pager;
import lk.klass.models.Video;
import lombok.Data;

import java.util.ArrayList;

/**
 * @author danushka
 * 2023-03-12
 */
@Data
public final class GetVideosResponse {
    public Pager pager;
    public ArrayList<Video> videos;
}
