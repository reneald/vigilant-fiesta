package be.leanderonline.cscg.api;

import be.leanderonline.cscg.model.characters.types.MongoTypeRepository;
import be.leanderonline.cscg.model.characters.types.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/type")
public class TypeEndpoint {
    @Autowired
    private MongoTypeRepository repository;

    @GetMapping("/{id}")
    public Type getById(String id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("No type found for that ID"));
    }

    @GetMapping("/all")
    public List<Type> getAll() {
        return repository.findAll();
    }
}
