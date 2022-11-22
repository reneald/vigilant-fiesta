package be.leanderonline.cscg.common;

import be.leanderonline.cscg.model.UuidIdentifiedEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface UuidIdentifiedMongoRepository <T extends UuidIdentifiedEntity> extends MongoRepository<T, UUID> {
}
