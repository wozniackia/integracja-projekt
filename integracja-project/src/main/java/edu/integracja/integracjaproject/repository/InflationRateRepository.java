package edu.integracja.integracjaproject.repository;

import edu.integracja.integracjaproject.model.InflationRate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InflationRateRepository extends MongoRepository<InflationRate, String> {

    Optional<InflationRate> findByYear(Integer year);

}
