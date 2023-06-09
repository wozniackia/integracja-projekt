package edu.integracja.integracjaproject.service;

import edu.integracja.integracjaproject.model.MinimalWageRate;
import edu.integracja.integracjaproject.repository.MinimalWageRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MinimalWageService {
    @Autowired
    private MinimalWageRateRepository minimalWageRateRepository;

    public List<MinimalWageRate> getAllData() {
        return minimalWageRateRepository.findAll();
    }

    public Optional<MinimalWageRate> getDataByYear(Integer year) {
        return minimalWageRateRepository.findByYear(year);
    }
}
