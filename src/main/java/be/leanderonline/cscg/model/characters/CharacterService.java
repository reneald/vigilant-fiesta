package be.leanderonline.cscg.model.characters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CharacterService {
    @Autowired
    private SimpleCharacterRepository repository;

    public UUID createEmptyCharacter() {
        return repository.createEmptyCharacter();
    }
    public Character createCharacter(Character character) {
        return repository.createCharacter(character);
    }

    public Set<Character> getAllCharacters() {
        return repository.getAllCharacters();
    }
}
