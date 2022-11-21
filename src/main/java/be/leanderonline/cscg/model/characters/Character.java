package be.leanderonline.cscg.model.characters;

import be.leanderonline.cscg.model.characters.stats.Statistics;
import lombok.Data;

import java.util.UUID;

@Data
public class Character {
    private final UUID id;
    private Statistics statistics;
    private String name;

    public Character() {
        this.id = UUID.randomUUID();
    }

    public Character(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public boolean hasId() {
        return this.id != null;
    }
}
