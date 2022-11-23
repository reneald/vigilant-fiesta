package be.leanderonline.cscg.model.characters;

import be.leanderonline.cscg.model.UuidIdentifiedEntity;
import be.leanderonline.cscg.model.characters.stats.Statistics;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Document("characters")
public class Character extends UuidIdentifiedEntity {
    private Statistics statistics;
    private String name;

    public Character(String name) {
        this.name = name;
    }
}
