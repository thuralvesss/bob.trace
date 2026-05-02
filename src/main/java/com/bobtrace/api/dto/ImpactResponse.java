package com.bobtrace.api.dto;

import lombok.Data;
import java.util.List;

@Data
public class ImpactResponse {
    private String classeAlvo;
    private List<String> classesAfetadas;
    private String riscoTotal; // Ex: "Alto", "Médio", "Baixo"
}
