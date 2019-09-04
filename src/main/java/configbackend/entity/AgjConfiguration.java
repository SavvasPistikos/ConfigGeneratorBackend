package configbackend.entity;

import java.time.Instant;

import javax.persistence.*;

@Entity
public class AgjConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "apis_yaml")
    private String apis;

    @Column(name = "updated_dt")
    private Instant updatedTime;

    public Instant getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Instant updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApis() {
        return apis;
    }

    public void setApis(String apis) {
        this.apis = apis;
    }
}
