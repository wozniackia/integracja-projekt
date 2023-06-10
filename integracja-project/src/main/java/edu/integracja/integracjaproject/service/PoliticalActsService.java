package edu.integracja.integracjaproject.service;

import edu.integracja.integracjaproject.model.PoliticalAct;
import edu.integracja.integracjaproject.repository.PoliticalActsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoliticalActsService {
    @Autowired
    private PoliticalActsRepository politicalActsRepository;

    public List<PoliticalAct> getAllData() {
        return politicalActsRepository.findAll();
    }

}
