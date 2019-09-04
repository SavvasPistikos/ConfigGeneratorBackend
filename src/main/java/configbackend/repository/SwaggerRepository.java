package configbackend.repository;

import configbackend.entity.SwaggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SwaggerRepository extends JpaRepository<SwaggerEntity, Integer> {

    SwaggerEntity findByServiceAndVersion(String service,String version);
}
