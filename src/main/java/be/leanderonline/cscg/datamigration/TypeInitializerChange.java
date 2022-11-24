package be.leanderonline.cscg.datamigration;

import be.leanderonline.cscg.model.characters.types.Type;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@ChangeUnit(id = "csrd-type-initial", order = "1", author = "reneald")
public class TypeInitializerChange {
    private final MongoTemplate mongoTemplate;

    public TypeInitializerChange(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Execution
    public void changeSet() {
        Type warrior = new Type(Type.WARRIOR, "Warrior", 10, 10, 8, 6, 1);
        Type adept = new Type(Type.ADEPT, "Adept", 7, 9, 12, 6, 1);
        Type explorer = new Type(Type.EXPLORER, "Explorer", 10, 9, 9, 6, 1);
        Type speaker = new Type(Type.SPEAKER, "Speaker", 8, 9, 11, 6, 1);
        mongoTemplate.save(warrior, Type.COLLECTION_NAME);
        mongoTemplate.save(adept, Type.COLLECTION_NAME);
        mongoTemplate.save(explorer, Type.COLLECTION_NAME);
        mongoTemplate.save(speaker, Type.COLLECTION_NAME);
    }

    @RollbackExecution
    public void rollback() {
        mongoTemplate.remove(new Query(), Type.COLLECTION_NAME);
    }

    private List<Type> getTypes() {
        return null;
    }
}
