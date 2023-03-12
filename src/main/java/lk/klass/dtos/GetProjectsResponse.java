package lk.klass.dtos;

import lk.klass.models.Pager;
import lk.klass.models.Project;
import lombok.Data;

import java.util.List;

/**
 * @author danushka
 * 2023-03-12
 */
@Data
public final class GetProjectsResponse {
    private Pager pager;
    private List<Project> projects;
}
