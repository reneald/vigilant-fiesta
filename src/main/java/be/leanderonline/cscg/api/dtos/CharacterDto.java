package be.leanderonline.cscg.api.dtos;

import be.leanderonline.cscg.model.characters.stats.Statistics;
import lombok.Data;

import java.util.UUID;

@Data
public class CharacterDto {
    private UUID id;
    private Statistics statistics;
    private String name;
}
