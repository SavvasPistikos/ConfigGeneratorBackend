package configbackend.controller;


import configbackend.entity.AgjConfiguration;
import configbackend.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
public class ConfigController {

    @Autowired
    ConfigurationService configurationService;


    @RequestMapping(value = "/api/v1.0/configuration", method = RequestMethod.POST)
    public void saveCurrentConfiguration(@RequestBody String apisYaml) {
        AgjConfiguration agjConfiguration = new AgjConfiguration();
        agjConfiguration.setApis(apisYaml);
        configurationService.saveConfiguration(agjConfiguration);
    }

    @RequestMapping(value = "/api/v1.0/configuration/{id}", method = RequestMethod.GET)
    public String getConfiguration(@PathVariable("id") Integer id) {
        return configurationService.getConfiguration(id).getApis().trim();
    }
}
