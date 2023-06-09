package edu.integracja.integracjaproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Entity
@Document(collection = "minimal_wage_rate")
@Data
@RequiredArgsConstructor
public class MinimalWageRate implements Serializable {
    @Id
    private String id;
    @NonNull
    private Integer year;
    @NonNull
    private Double rate;
}
