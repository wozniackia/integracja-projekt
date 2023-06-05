package edu.integracja.integracjaproject;

import edu.integracja.integracjaproject.repository.FertilityRateRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableMongoRepositories(basePackageClasses = FertilityRateRepository.class)
public class IntegracjaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegracjaProjectApplication.class, args);
	}

}
