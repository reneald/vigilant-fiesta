package be.leanderonline.cscg.common;

import be.leanderonline.cscg.model.UuidIdentifiedEntity;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import java.util.UUID;

public class UuidIdentifiedMongoRepositoryImpl <T extends UuidIdentifiedEntity>
        extends SimpleMongoRepository<T, UUID> implements UuidIdentifiedMongoRepository<T>{

    public UuidIdentifiedMongoRepositoryImpl(MongoEntityInformation<T, UUID> metadata, MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
    }

    @Override
    public <S extends T> S save(S entity) {
        generateId(entity);
        return super.save(entity);
    }

    private <S extends T> void generateId(S entity) {
        if (entity.getId() == null) {
            entity.setId(UUID.randomUUID());
        }
    }

    @Override
    public <S extends T> S insert(S entity) {
        generateId(entity);
        return super.insert(entity);
    }
}
