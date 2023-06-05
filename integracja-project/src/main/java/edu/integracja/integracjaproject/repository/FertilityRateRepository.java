package edu.integracja.integracjaproject.repository;

import edu.integracja.integracjaproject.model.FertilityRate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FertilityRateRepository extends MongoRepository<FertilityRate, String> {
    Optional<FertilityRate> findByYear(Integer year);
}
