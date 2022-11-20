package be.leanderonline.cscg.api;

import be.leanderonline.cscg.model.characters.Character;
import be.leanderonline.cscg.model.characters.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.UUID;

@RestController
public class CharacterEndpoint {
    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping("/character/new")
    public UUID createEmptyCharacter() {
        return characterRepository.createEmptyCharacter();
    }

    @GetMapping("/character/all")
    public Set<Character> getAllCharacters() {
        return characterRepository.getAllCharacters();
    }
}
