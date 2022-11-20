package be.leanderonline.cscg.model.characters.stats;

public record Pool(int max, int current) {
    public Pool(int amount) {
        this(amount, amount);
    }
}
