package lk.klass.models;

import lombok.Data;

/**
 * @author danushka
 * 2023-03-12
 */
@Data
public final class Pager {
    public int page;
    public int totalPages;
    public int totalResults;
    public String sort;
}
