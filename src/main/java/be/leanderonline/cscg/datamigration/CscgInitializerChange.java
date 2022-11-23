package be.leanderonline.cscg.datamigration;

import be.leanderonline.cscg.model.characters.types.Type;
import io.mongock.api.annotations.ChangeUnit;
import io.mongock.api.annotations.Execution;
import io.mongock.api.annotations.RollbackExecution;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@ChangeUnit(id="csrd-type-initial", order = "1", author = "reneald")
public class CscgInitializerChange {
    private final MongoTemplate mongoTemplate;

    public CscgInitializerChange(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Execution
    public void changeSet() {

    }

    @RollbackExecution
    public void rollback() {
//        mongoTemplate.;
    }

    private List<Type> getTypes() {
        return null;
    }
}
