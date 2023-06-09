package edu.integracja.integracjaproject.controller;

import edu.integracja.integracjaproject.model.InflationRate;
import edu.integracja.integracjaproject.service.InflationRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/inflation")
public class InflationRateController {
    @Autowired
    private InflationRateService inflationRateService;

    @GetMapping("get")
    public List<InflationRate> getAllData() {
        return inflationRateService.getAllData();
    }

    @GetMapping("get/{year}")
    public Optional<InflationRate> getDataByYear(@PathVariable("year") Integer year) {
        return inflationRateService.getDataByYear(year);
    }
}
