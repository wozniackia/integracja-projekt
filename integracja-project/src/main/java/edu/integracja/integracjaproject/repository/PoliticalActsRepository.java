package edu.integracja.integracjaproject.repository;

import edu.integracja.integracjaproject.model.PoliticalAct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PoliticalActsRepository extends MongoRepository<PoliticalAct, String> {
}
