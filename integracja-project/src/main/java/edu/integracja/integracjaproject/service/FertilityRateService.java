package edu.integracja.integracjaproject.service;

import edu.integracja.integracjaproject.helper.FileConverterUtil;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Slf4j
@Service
public class FertilityRateService {
    @PostConstruct
    public void init() throws IOException {
        FileConverterUtil.readCsvFile("/home/student/Pulpit/integracja-projekt/integracja-project/src/main/resources/data/fertility.csv");
        FileConverterUtil.readCsvFile("/home/student/Pulpit/integracja-projekt/integracja-project/src/main/resources/data/inflation.csv");
        FileConverterUtil.readCsvFile("/home/student/Pulpit/integracja-projekt/integracja-project/src/main/resources/data/minimal_wage.csv");
        FileConverterUtil.readCsvFile("/home/student/Pulpit/integracja-projekt/integracja-project/src/main/resources/data/unemployment.csv");
        log.info("test");
    }

}
