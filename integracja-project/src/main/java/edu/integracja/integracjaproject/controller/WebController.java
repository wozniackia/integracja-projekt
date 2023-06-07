package edu.integracja.integracjaproject.controller;

import edu.integracja.integracjaproject.model.FertilityRate;
import edu.integracja.integracjaproject.model.InflationRate;
import edu.integracja.integracjaproject.service.FertilityRateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import java.util.stream.Collectors;


@Controller
public class WebController {

    @Autowired
    private FertilityRateService fertilityRateService;

    @GetMapping("/")
    public String displayMainView(Model model) {
//        model.addAttribute("fertilities", fertilityRateService.getAllData()
//                .stream()
//                .flatMap(c-> Stream.of(c.getYear(),c.getRate()))
//                .collect(Collectors.toList())
//        );
        final List<FertilityRate> fertilityRates = fertilityRateService.getAllData();
        model.addAttribute("data", fertilityRates.stream()
                .map(fertilityRate -> List.of(
                        fertilityRate.getYear(),
                        fertilityRate.getRate(),
                        fertilityRateService.getDataByYear(fertilityRate.getYear()).get().getRate()-0.3
                ))
                .collect(Collectors.toList())
        );
        return "mainView";
    }
}
