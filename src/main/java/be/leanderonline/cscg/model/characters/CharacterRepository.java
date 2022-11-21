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
        if (this.characters == null) {
            return null;
        }
        return this.characters.stream()
                .filter(character -> character.getId() == id)
                .findAny()
                .orElse(null);
    }

    public Character createCharacter(Character character) {
        if (getById(character.getId()) != null) {
            throw new IllegalArgumentException("A character with that UUID already exists.");
        }
        return persist(character);
    }
}
