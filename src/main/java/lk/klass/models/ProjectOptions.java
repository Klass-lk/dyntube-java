package lk.klass.models;

import lombok.Data;

/**
 * @author danushka
 * 2023-03-12
 */
@Data
public final class ProjectOptions {
    public boolean convertToHls;
    public boolean convertToMp4;
    public boolean convertToOneMp4;
    public boolean useOriginalMp4;
    public boolean hlsEncrypt;
    public int bitrate240p;
    public int bitrate360p;
    public int bitrate540p;
    public int bitrate720p;
    public int bitrate1080p;
    public int bitrate1440p;
    public int bitrate2160p;
    public boolean saveOriginalVideos;
}
