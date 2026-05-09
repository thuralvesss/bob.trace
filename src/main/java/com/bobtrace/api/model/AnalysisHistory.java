package com.bobtrace.api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class AnalysisHistory {
    @Id
    private Long id;
    private String targetClass;
    private String riskLevel;
    private LocalDateTime analysisDate = LocalDateTime.now();
}
