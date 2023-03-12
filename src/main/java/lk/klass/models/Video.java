package lk.klass.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author danushka
 * 2023-03-12
 */
@Data
public final class Video {
    public String id;
    public String duration;
    public String projectId;
    public String accountKey;
    public String region;
    public Image image;
    public ArrayList<Object> captions;
    public String key;
    public String channelKey;
    public String privateLink;
    public String iframeLink;
    public String hlsLink;
    public int planType;
    public String mp4Url;
    public ArrayList<Object> mp4Urls;
    public Formats formats;
    public String hlsUrl;
    public String hlsUrlWeb;
    public String title;
    public String description;
    public VideoOptions options;
    public ArrayList<Object> tags;
    public int version;
    public int status;
    public Date created;
}
