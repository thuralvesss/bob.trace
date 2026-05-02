package com.bobtrace.api.service;

import org.springframework.stereotype.Service;

@Service
public class PromptService {

    // Método para pedir ao Bob quem são os dependentes da classe
    public String gerarPromptAnalise(String classe) {
        return "Act as a Senior Java Architect. Analyze the current repository context and list all classes or methods that directly or indirectly depend on the class: " + classe + ". Provide a clear list of these dependencies.";
    }

    // Método para pedir ao Bob a criação do teste unitário
    public String gerarPromptTeste(String classe) {
        return "Using the context of this repository, generate a robust JUnit 5 test class using Mockito for the class: " + classe + ". Focus on covering edge cases and ensuring business logic integrity.";
    }
}
