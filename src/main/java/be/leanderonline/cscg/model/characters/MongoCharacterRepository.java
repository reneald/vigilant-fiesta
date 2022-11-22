package be.leanderonline.cscg.model.characters;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface MongoCharacterRepository extends MongoRepository<Character, UUID> {

}
