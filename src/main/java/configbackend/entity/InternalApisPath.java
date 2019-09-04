package configbackend.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "int_paths")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InternalApisPath {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "endpoint")
    @NotNull
    private String endpoint;

    @Column(name = "method")
    @NotNull
    private String method;

    @Column(name = "trnsTypeId")
    private Integer trnsTypeId;

    @Column(name = "disp")
    private Boolean display;

    @Column(name = "auth")
    private Boolean authorize;

    private Persist persist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getTrnsTypeId() {
        return trnsTypeId;
    }

    public void setTrnsTypeId(Integer trnsTypeId) {
        this.trnsTypeId = trnsTypeId;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public Boolean getAuthorize() {
        return authorize;
    }

    public void setAuthorize(Boolean authorize) {
        this.authorize = authorize;
    }

    public Persist getPersist() {
        return persist;
    }

    public void setPersist(Persist persist) {
        this.persist = persist;
    }
}
