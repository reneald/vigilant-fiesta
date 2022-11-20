package be.leanderonline.cscg.model.characters;

import be.leanderonline.cscg.model.characters.stats.*;
import lombok.Data;

import java.util.UUID;

@Data
public class Character {
    private final UUID id;
    private Statistics statistics;
    private String name;

    public Character(String name) {
        this.id = UUID.randomUUID();
        this.statistics = new Statistics(might(), speed(), intellect());
        this.name = name;
    }

    private static Statistic might() {
        return new Statistic(StatisticType.MIGHT, new Pool(1, 1), new Edge(1));
    }
    private static Statistic speed() {
        return new Statistic(StatisticType.SPEED, new Pool(1, 1), new Edge(1));
    }
    private static Statistic intellect() {
        return new Statistic(StatisticType.INTELLECT, new Pool(1, 1), new Edge(1));
    }
}
