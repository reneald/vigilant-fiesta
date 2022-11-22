package be.leanderonline.cscg.model.characters.types;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("types")
public record Type(String name, int might, int speed, int intellect, int additionalPoints) {
}
