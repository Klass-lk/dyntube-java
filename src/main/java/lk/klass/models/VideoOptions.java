package lk.klass.models;

import lombok.Data;

/**
 * @author danushka
 * 2023-03-12
 */
@Data
public final class VideoOptions {
    public boolean secureMp4;
    public boolean autoplay;
    public String playerColor;
    public String playerSkin;
    public String controlsColor;
    public boolean seekButtons;
    public boolean volumeControl;
    public String preload;
    public boolean fullscreenControl;
    public boolean controls;
    public boolean stickyControls;
    public String defaultQuality;
    public boolean qualityControl;
    public boolean speedControl;
    public boolean fastForward;
    public boolean bigPlayControl;
    public boolean playControl;
    public double volume;
    public boolean loop;
    public boolean muted;
    public boolean linkSharing;
    public boolean modal;
    public boolean resumePlayback;
}
