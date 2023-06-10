package edu.integracja.integracjaproject.controller;

import edu.integracja.integracjaproject.model.*;
import edu.integracja.integracjaproject.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;


@Controller
public class WebController {

    @Autowired
    private FertilityRateService fertilityRateService;
    @Autowired
    private InflationRateService inflationRateService;
    @Autowired
    private MinimalWageService minimalWageService;
    @Autowired
    private UnemploymentService unemploymentService;
    @Autowired
    private PoliticalActsService politicalActsService;

    @GetMapping("/")
    public String displayMainView(Model model) {
        final List<FertilityRate> fertilityRates = fertilityRateService.getAllData();
        final List<PoliticalAct> acts = politicalActsService.getAllData();
        model.addAttribute("acts", acts.stream()
                .map(act -> act.getValue()).toList());
        model.addAttribute("data", fertilityRates.stream()
                .map(fertilityRate -> {
                    if (minimalWageService.getDataByYear(fertilityRate.getYear()).isPresent()) {
                        return List.of(
                                fertilityRate.getYear(),
                                fertilityRate.getRate(),
                                inflationRateService.getDataByYear(fertilityRate.getYear()).orElse(new InflationRate(fertilityRate.getYear(), 0d)).getRate(),
                                unemploymentService.getDataByYear(fertilityRate.getYear()).orElse(new UnemploymentRate(fertilityRate.getYear(), 0d)).getRate(),
                                minimalWageService.getDataByYear(fertilityRate.getYear()).orElse(new MinimalWageRate(fertilityRate.getYear(), 0d)).getRate()/1000
                        );
                    } else {
                        return List.of(
                                fertilityRate.getYear(),
                                fertilityRate.getRate(),
                                inflationRateService.getDataByYear(fertilityRate.getYear()).orElse(new InflationRate(fertilityRate.getYear(), 0d)).getRate(),
                                unemploymentService.getDataByYear(fertilityRate.getYear()).orElse(new UnemploymentRate(fertilityRate.getYear(), 0d)).getRate()
                        );
                    }
                })
                .toList()
        );
        return "mainView";
    }
}
