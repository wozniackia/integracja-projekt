package edu.integracja.integracjaproject.service;

import edu.integracja.integracjaproject.model.FertilityRate;
import edu.integracja.integracjaproject.model.RateModel;
import edu.integracja.integracjaproject.repository.FertilityRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public List<FertilityRate> insertAll(Iterable<FertilityRate> data) {return fertilityRateRepository.insert(data);}

    public void deleteAll() {fertilityRateRepository.deleteAll();}

    public List<FertilityRate> fromRateModel(List<RateModel> data) {
        return data.stream()
                .map(rateModel -> new FertilityRate(rateModel.getYear(), rateModel.getRate()))
                .toList();
    }
}
