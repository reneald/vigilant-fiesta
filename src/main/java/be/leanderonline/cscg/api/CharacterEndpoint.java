package be.leanderonline.cscg.api;

import be.leanderonline.cscg.api.dtos.CharacterDto;
import be.leanderonline.cscg.model.characters.Character;
import be.leanderonline.cscg.model.characters.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/character")
public class CharacterEndpoint {
    @Autowired
    private CharacterService service;

    @PostMapping("/new")
    public @ResponseBody CharacterDto createNewCharacter(@RequestBody CharacterDto characterDto) {
        Character characterToCreate = ModelMapperUtil.map(characterDto, Character.class);
        return ModelMapperUtil.map(service.createCharacter(characterToCreate), CharacterDto.class);
    }

    @GetMapping("/all")
    public List<Character> getAllCharacters() {
        return service.getAllCharacters();
    }
}
