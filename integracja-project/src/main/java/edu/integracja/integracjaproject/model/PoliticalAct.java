package edu.integracja.integracjaproject.model;

import com.mongodb.lang.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document(collection = "acts")
@Data
@RequiredArgsConstructor
public class PoliticalAct {
    @Id
    private String id;
    @Nullable
    private String value;
}
