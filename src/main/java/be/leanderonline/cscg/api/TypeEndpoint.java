package be.leanderonline.cscg.api;

import be.leanderonline.cscg.model.characters.types.Type;
import be.leanderonline.cscg.model.characters.types.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TypeEndpoint {
    @Autowired
    private TypeRepository repository;

    @GetMapping("/type/{id}")
    public Type getById(int id) {
        return repository.getById(id).orElseThrow(() -> new IllegalArgumentException("No type found for that ID"));
    }
}
