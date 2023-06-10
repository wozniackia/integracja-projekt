package edu.integracja.integracjaproject.repository;

import edu.integracja.integracjaproject.model.UnemploymentRate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnemploymentRepository extends MongoRepository<UnemploymentRate, String> {
    Optional<UnemploymentRate> findByYear(Integer year);
}
