package be.leanderonline.cscg.model.characters.foci;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("foci")
public record Focus(int id, String name) {
}
