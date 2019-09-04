package configbackend.repository;

import configbackend.entity.InternalApisPath;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternalApisPathRepository extends JpaRepository<InternalApisPath, Integer> {
	InternalApisPath getByEndpointAndMethod(String endpoint, String method);
}
