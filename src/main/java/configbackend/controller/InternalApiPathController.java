package configbackend.controller;


import configbackend.entity.InternalApisPath;
import configbackend.service.InternalPathsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
public class InternalApiPathController {

    @Autowired
    InternalPathsService internalPathsService;


    @RequestMapping(value = "/api/v1.0/internal/{id}")
    public InternalApisPath getInternalPath(@PathVariable(name = "id") Integer id) {
        return internalPathsService.getOneById(id);
    }

    @RequestMapping(value = "/api/v1.0/internal")
    public List<InternalApisPath> getAllInternalPath() {
        return internalPathsService.getAllPaths();
    }

    @RequestMapping(value = "/api/v1.0/internal", method = RequestMethod.POST)
    public InternalApisPath saveInternalPath(@RequestBody InternalApisPath path) {
        return internalPathsService.save(path);
    }

}
