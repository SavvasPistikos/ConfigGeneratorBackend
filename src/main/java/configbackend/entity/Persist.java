package configbackend.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Persist {

    @Column(name = "HEADERS")
    private String headers;
    @Column(name = "QUERY_PARAMS")
    private String queryParams;

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(String queryParams) {
        this.queryParams = queryParams;
    }
}
