package be.leanderonline.cscg.model.characters;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Repository
public class CharacterRepository {
    private Set<Character> characters;

    public UUID createEmptyCharacter() {
        Character newChar = new Character("");
        return persist(newChar).getId();
    }

    private Character persist(Character character) {
        if (this.characters == null) {
            this.characters = new HashSet<>();
        }
        this.characters.add(character);
        return character;
    }

    public Set<Character> getAllCharacters() {
        if (this.characters == null) {
            return Collections.emptySet();
        }
        return this.characters;
    }

    public Character getById(UUID id) {
        return this.characters.stream().findAny().orElse(null);
    }
}
