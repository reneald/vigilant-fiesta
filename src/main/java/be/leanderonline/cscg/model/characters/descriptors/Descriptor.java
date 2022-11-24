package be.leanderonline.cscg.model.characters.descriptors;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("descriptors")
public record Descriptor(int id, String name) {
    public static final int APPEALING = 1;
    public static final int BENEFICENT = 2;
    public static final int BRASH = 3;
    public static final int CALM = 4;
    public static final int CHAOTIC = 5;
    public static final int CHARMING = 6;
    public static final int CLEVER = 7;
    public static final int CLUMSY = 8;
    public static final int CRAVEN = 9;
    public static final int CREATIVE = 10;
    public static final int CRUEL = 11;
    public static final int DISHONORABLE = 12;
    public static final int DOOMED = 13;
    public static final int EMPATHIC = 14;
    public static final int EXILED = 15;
    public static final int FAST = 16;
    public static final int FOOLISH = 17;
    public static final int GRACEFUL = 18;
    public static final int GUARDED = 19;
    public static final int HARDY = 20;
    public static final int HIDEOUS = 21;
    public static final int HONORABLE = 22;
    public static final int IMPULSIVE = 23;
    public static final int INQUISITIVE = 24;
    public static final int INTELLIGENT = 25;
    public static final int INTUITIVE = 26;
    public static final int JOVIAL = 27;
    public static final int KIND = 28;
    public static final int LEARNED = 29;
    public static final int LUCKY = 30;
    public static final int MAD = 31;
    public static final int MECHANICAL = 32;
    public static final int MYSTERIOUS = 33;
    public static final int MYSTICAL = 34;
    public static final int NAIVE = 35;
    public static final int PERCEPTIVE = 36;
    public static final int RESILIENT = 37;
    public static final int RISK_TAKING = 38;
    public static final int RUGGED = 39;
    public static final int SHARP_EYED = 40;
    public static final int SKEPTICAL = 41;
    public static final int STEALTHY = 42;
    public static final int STRONG = 43;
    public static final int STRONG_WILLED = 44;
    public static final int SWIFT = 45;
    public static final int TONGUE_TIED = 46;
    public static final int TOUGH = 47;
    public static final int VICIOUS = 48;
    public static final int VIRTUOUS = 49;
    public static final int WEIRD = 50;
}
