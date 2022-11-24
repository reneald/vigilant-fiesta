package be.leanderonline.cscg.model.characters.types;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(Type.COLLECTION_NAME)
public record Type(int id, String name, int might, int speed, int intellect, int additionalPoints, int effort) {
    public static final String COLLECTION_NAME = "types";
    public static final int WARRIOR = 1;
    public static final int ADEPT = 2;
    public static final int EXPLORER = 3;
    public static final int SPEAKER = 4;
}
