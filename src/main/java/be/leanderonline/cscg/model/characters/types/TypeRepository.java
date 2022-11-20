package be.leanderonline.cscg.model.characters.types;

import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public class TypeRepository {
    private Set<Type> types;

    public Optional<Type> getById(int id) {
        if(this.types == null) {
            return Optional.empty();
        }
        return this.types.stream().findAny();
    }
}