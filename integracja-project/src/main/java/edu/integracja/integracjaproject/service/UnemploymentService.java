package edu.integracja.integracjaproject.service;

import edu.integracja.integracjaproject.model.RateModel;
import edu.integracja.integracjaproject.model.UnemploymentRate;
import edu.integracja.integracjaproject.repository.UnemploymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UnemploymentService {
    @Autowired
    private UnemploymentRepository unemploymentRepository;

    public List<UnemploymentRate> getAllData(){return unemploymentRepository.findAll();}

    public Optional<UnemploymentRate> getDataByYear(Integer year) {
        return unemploymentRepository.findByYear(year);
    }

    public List<UnemploymentRate> insertAll(Iterable<UnemploymentRate> data) {return unemploymentRepository.insert(data);}

    public void deleteAll() {unemploymentRepository.deleteAll();}

    public List<UnemploymentRate> fromRateModel(List<RateModel> data) {
        return data.stream()
                .map(rateModel -> new UnemploymentRate(rateModel.getYear(), rateModel.getRate()))
                .toList();
    }
}
