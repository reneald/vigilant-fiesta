package be.leanderonline.cscg;

import be.leanderonline.cscg.common.UuidIdentifiedMongoRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(repositoryBaseClass = UuidIdentifiedMongoRepositoryImpl.class)
@SpringBootApplication
public class CscgApplication {

	public static void main(String[] args) {
		SpringApplication.run(CscgApplication.class, args);
	}

}
