package configbackend.service;

import configbackend.entity.InternalApisPath;
import configbackend.repository.InternalApisPathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternalPathsService {

    @Autowired
    InternalApisPathRepository internalApisPathRepository;


    public List<InternalApisPath> getAllPaths(){
        return internalApisPathRepository.findAll();
    }

    public InternalApisPath getOneById(Integer id){
        return internalApisPathRepository.getOne(id);
    }

    public InternalApisPath save(InternalApisPath path){
        List<InternalApisPath> all = internalApisPathRepository.findAll();

        Boolean insert = all.stream()
                .anyMatch(r -> r.getEndpoint().equals(path.getEndpoint()) && r.getMethod().equals(path.getMethod()));

        return insert
                ? internalApisPathRepository.getByEndpointAndMethod(path.getEndpoint(), path.getMethod())
                : internalApisPathRepository.save(path);
    }

    public void remove(Integer id){
        internalApisPathRepository.deleteById(id);
    }
}
