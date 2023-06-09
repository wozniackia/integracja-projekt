package edu.integracja.integracjaproject.repository;

import edu.integracja.integracjaproject.model.MinimalWageRate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MinimalWageRateRepository extends MongoRepository<MinimalWageRate, String> {
    Optional<MinimalWageRate> findByYear(Integer year);
}
