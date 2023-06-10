package edu.integracja.integracjaproject.controller;

import edu.integracja.integracjaproject.model.PoliticalAct;
import edu.integracja.integracjaproject.service.PoliticalActsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/acts")
public class PoliticalActsController {
    @Autowired
    private PoliticalActsService politicalActsService;

    @GetMapping("get")
    public List<PoliticalAct> getAllData() {
        return politicalActsService.getAllData();
    }

}
