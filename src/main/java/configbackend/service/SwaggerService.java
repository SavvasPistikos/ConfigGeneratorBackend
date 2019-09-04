package configbackend.service;

import configbackend.entity.SwaggerEntity;
import configbackend.repository.SwaggerRepository;
import configbackend.service.entitydto.SwaggerServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SwaggerService {

    @Autowired
    SwaggerRepository swaggerRepository;

    public List<SwaggerServiceDTO> getServices() {
        List<SwaggerServiceDTO> services = new ArrayList<>();
        List<SwaggerEntity> swaggerEntities = swaggerRepository.findAll();

        swaggerEntities.forEach(e -> {
            SwaggerServiceDTO dummy = new SwaggerServiceDTO();
            dummy.setId(e.getId());
            dummy.setService(e.getService());
            dummy.setVersion(e.getVersion());
            services.add(dummy);
        });
        return services;
    }

    public SwaggerEntity getServiceSwagger(Integer id) {
        return swaggerRepository.findById(id).get();
    }

    public void delete(Integer id) {
        swaggerRepository.deleteById(id);
    }

    public void update(SwaggerEntity entity) {
        swaggerRepository.save(entity);
    }

    public void add(SwaggerEntity entity) {
        swaggerRepository.save(entity);
    }
}
