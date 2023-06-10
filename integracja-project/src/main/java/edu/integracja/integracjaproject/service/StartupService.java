package edu.integracja.integracjaproject.service;

import edu.integracja.integracjaproject.model.*;
import edu.integracja.integracjaproject.util.FileConverterUtil;
import jakarta.annotation.PostConstruct;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StartupService {

    @Value("${files.relative}")
    private String relativeDir;
    @Autowired
    private FertilityRateService fertilityRateService;
    @Autowired
    private InflationRateService inflationRateService;
    @Autowired
    private MinimalWageService minimalWageService;
    @Autowired
    private UnemploymentService unemploymentService;

    @PostConstruct
    void startup() {
        fertilityRateService.deleteAll();
        inflationRateService.deleteAll();
        minimalWageService.deleteAll();
        unemploymentService.deleteAll();
        var files = FileConverterUtil.getFilesToConvert(relativeDir)
                .stream()
                .map(file -> FileConverterUtil.readCsvFile(relativeDir, file))
                .toList();

        files.forEach(this::convertAndInsertToDb);
    }

    void convertAndInsertToDb(Pair<String, List<RateModel>> pair) {
        switch (pair.getKey()) {
            case "fertility":
                List<FertilityRate> convertedValues = fertilityRateService.fromRateModel(pair.getValue());
                fertilityRateService.insertAll(convertedValues);
                break;
            case "inflation":
                List<InflationRate> convertedValues2 = inflationRateService.fromRateModel(pair.getValue());
                inflationRateService.insertAll(convertedValues2);
                break;
            case "minimal_wage":
                List<MinimalWageRate> convertedValues3 = minimalWageService.fromRateModel(pair.getValue());
                minimalWageService.insertAll(convertedValues3);
                break;
            case "unemployment":
                List<UnemploymentRate> convertedValues4 = unemploymentService.fromRateModel(pair.getValue());
                unemploymentService.insertAll(convertedValues4);
                break;
            default:
                break;
        }
    }
}
