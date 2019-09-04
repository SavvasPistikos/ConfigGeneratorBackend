package configbackend.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import configbackend.entity.SwaggerEntity;
import configbackend.service.SwaggerService;
import configbackend.service.entitydto.SwaggerServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
public class SwaggerController {

	@Autowired
	SwaggerService swaggerService;

	@RequestMapping(value = "/api/v1.0/swaggers", method = RequestMethod.GET)
	public List<SwaggerServiceDTO> getServices() {
		return swaggerService.getServices();
	}

	@RequestMapping(value = "/api/v1.0/swaggers/{id}")
	public SwaggerEntity getServiceSwagger(@PathVariable(name = "id") Integer id) {
		return swaggerService.getServiceSwagger(id);
	}

	@RequestMapping(value = "/api/v1.0/swaggers/{id}", method = RequestMethod.DELETE)
	public void deleteService(@PathVariable(name = "id") Integer id) {
		swaggerService.delete(id);
	}

	@RequestMapping(value = "/api/v1.0/swaggers", method = RequestMethod.PUT)
	public void updateService(@RequestBody SwaggerEntity entity) {
		swaggerService.update(entity);
	}

	@RequestMapping(value = "/api/v1.0/swaggers", method = RequestMethod.POST)
	public void addService(@RequestBody SwaggerEntity entity) {
		swaggerService.add(entity);
	}

	@RequestMapping(value = "/api/v1.0/yaml", method = RequestMethod.POST)
	public Object yamlToJson(@RequestBody String yaml) {
		try {
			return new ObjectMapper(new YAMLFactory()).readValue(yaml, Object.class);
		} catch (Exception e) {
			return null;
		}
	}
}
