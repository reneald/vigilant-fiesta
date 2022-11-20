package be.leanderonline.cscg.model.characters.stats;

import be.leanderonline.cscg.model.characters.types.Type;

public record Statistics(Statistic might, Statistic speed, Statistic intellect, int pointsToSpend) {
    public Statistics(Type type) {
        this(might(type), speed(type), intellect(type), type.additionalPoints());
    }

    private static Statistic might(Type type) {
        return new Statistic(StatisticType.MIGHT, new Pool(type.might()), new Edge(0));
    }

    private static Statistic speed(Type type) {
        return new Statistic(StatisticType.SPEED, new Pool(type.speed()), new Edge(0));
    }
    private static Statistic intellect(Type type) {
        return new Statistic(StatisticType.INTELLECT, new Pool(type.intellect()), new Edge(0));
    }
}
