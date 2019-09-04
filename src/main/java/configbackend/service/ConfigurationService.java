package configbackend.service;

import java.time.Instant;

import configbackend.entity.AgjConfiguration;
import configbackend.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {

    @Autowired
    ConfigurationRepository configurationRepository;


    public void saveConfiguration(AgjConfiguration configuration){
        configuration.setUpdatedTime(Instant.ofEpochMilli(System.currentTimeMillis()));
        configurationRepository.save(configuration);
    }

    public AgjConfiguration getConfiguration(Integer id){
       return  configurationRepository.getOne(id);
    }
}
