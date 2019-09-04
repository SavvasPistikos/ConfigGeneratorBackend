package configbackend.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "swagger")
public class SwaggerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "SERVICE")
    @NotNull
    @Size(min = 1)
    private String service;

    @Column(name = "CONTENT")
    @NotNull
    @Size(min = 1)
    private String content;

    @Column(name = "SWAGGER_URL")
    private String swaggerurl;

    @Column(name = "VERSION")
    private String version;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSwaggerurl() {
        return swaggerurl;
    }

    public void setSwaggerurl(String swaggerurl) {
        this.swaggerurl = swaggerurl;
    }
}
