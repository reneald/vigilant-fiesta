package be.leanderonline.cscg.model.characters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {
    @Autowired
    private MongoCharacterRepository repository;

    public Character createCharacter(Character character) {
        return repository.insert(character);
    }

    public List<Character> getAllCharacters() {
        return repository.findAll();
    }
}
