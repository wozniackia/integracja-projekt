package edu.integracja.integracjaproject.service;

import edu.integracja.integracjaproject.model.FertilityRate;
import edu.integracja.integracjaproject.repository.FertilityRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FertilityRateService {
    @Autowired
    private FertilityRateRepository fertilityRateRepository;

    public List<FertilityRate> getAllData() {
        return fertilityRateRepository.findAll();
    }

    public Optional<FertilityRate> getDataByYear(Integer year) {
        return fertilityRateRepository.findByYear(year);
    }
}
