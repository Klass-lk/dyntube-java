package lk.klass.dtos;

import lk.klass.models.ProjectOptions;
import lombok.Data;

/**
 * @author danushka
 * 2023-03-12
 */
@Data
public final class CreateProjectRequest {
    public String name;
    public String description;
    public String region;
    public int planType;
    public ProjectOptions options;
}
