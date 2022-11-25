package be.leanderonline.cscg.model.characters.stats;

import lombok.Data;

@Data
public class PointsToSpend {
    private int points;

    public PointsToSpend(int points) {
        this.points = points;
    }
}
