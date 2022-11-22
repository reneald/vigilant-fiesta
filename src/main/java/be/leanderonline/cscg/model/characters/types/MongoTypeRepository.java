package be.leanderonline.cscg.model.characters.types;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoTypeRepository extends MongoRepository<Type, String> {
}
