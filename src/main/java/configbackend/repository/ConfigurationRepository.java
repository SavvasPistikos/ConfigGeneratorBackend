package configbackend.repository;

import configbackend.entity.AgjConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigurationRepository extends JpaRepository<AgjConfiguration, Integer> {
}
