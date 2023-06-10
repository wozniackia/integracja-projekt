package edu.integracja.integracjaproject.controller;

import edu.integracja.integracjaproject.model.MinimalWageRate;
import edu.integracja.integracjaproject.service.MinimalWageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/unemployment")
public class UnemploymentController {

    @Autowired
    private MinimalWageService minimalWageService;

    @GetMapping("get")
    public List<MinimalWageRate> getAllData() {
        return minimalWageService.getAllData();
    }

    @GetMapping("get/{year}")
    public Optional<MinimalWageRate> getDataByYear(@PathVariable("year") Integer year) {
        return minimalWageService.getDataByYear(year);
    }
}
