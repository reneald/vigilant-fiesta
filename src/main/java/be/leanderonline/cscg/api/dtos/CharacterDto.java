package be.leanderonline.cscg.api.dtos;

import be.leanderonline.cscg.model.characters.stats.Statistics;

import java.util.UUID;

//@Data
public class CharacterDto {
    private UUID id;
    private Statistics statistics;
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
