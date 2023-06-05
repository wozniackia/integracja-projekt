package edu.integracja.integracjaproject.controller;

import edu.integracja.integracjaproject.model.FertilityRate;
import edu.integracja.integracjaproject.service.FertilityRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/fertility")
public class FertilityRateController {

    @Autowired
    private FertilityRateService fertilityRateService;

    @GetMapping("get")
    public List<FertilityRate> getAllData() {
        return fertilityRateService.getAllData();
    }

    @GetMapping("get/{year}")
    public Optional<FertilityRate> getDataByYear(@PathVariable("year") Integer year) {
        return fertilityRateService.getDataByYear(year);
    }
}
