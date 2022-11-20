package be.leanderonline.cscg.api;

import be.leanderonline.cscg.model.characters.Character;
import be.leanderonline.cscg.model.characters.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;
import java.util.UUID;

@CrossOrigin
@RestController()
@RequestMapping("/character")
public class CharacterEndpoint {
    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping("/new")
    public UUID createEmptyCharacter() {
        return characterRepository.createEmptyCharacter();
    }

    @GetMapping("/all")
    public Set<Character> getAllCharacters() {
        return characterRepository.getAllCharacters();
    }
}
