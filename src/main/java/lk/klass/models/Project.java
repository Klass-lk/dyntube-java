package lk.klass.models;

import lombok.Data;

import java.util.Date;

/**
 * @author danushka
 * 2023-03-12
 */
@Data
public final class Project {
    public String id;
    public String key;
    public String name;
    public String description;
    public String region;
    public int planType;
    public ProjectOptions options;
    public VideoOptions videoOptions;
    public int status;
    public Date created;
    public Date updated;
}
