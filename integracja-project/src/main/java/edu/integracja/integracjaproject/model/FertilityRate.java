package edu.integracja.integracjaproject.model;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fertility_rate")
@Data
@RequiredArgsConstructor
public class FertilityRate {
    @Id
    private String id;
    @NonNull
    private Integer year;
    @NonNull
    private Double rate;
}

