package edu.integracja.integracjaproject.service;

import edu.integracja.integracjaproject.model.InflationRate;
import edu.integracja.integracjaproject.model.RateModel;
import edu.integracja.integracjaproject.repository.InflationRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InflationRateService {
    @Autowired
    private InflationRateRepository inflationRateRepository;

    public List<InflationRate> getAllData() {
        return inflationRateRepository.findAll();
    }

    public Optional<InflationRate> getDataByYear(Integer year) {
        return inflationRateRepository.findByYear(year);
    }

    public List<InflationRate> insertAll(Iterable<InflationRate> data) {return inflationRateRepository.insert(data);}

    public void deleteAll() {inflationRateRepository.deleteAll();}

    public List<InflationRate> fromRateModel(List<RateModel> data) {
        return data.stream()
                .map(rateModel -> new InflationRate(rateModel.getYear(), rateModel.getRate()))
                .toList();
    }
}
