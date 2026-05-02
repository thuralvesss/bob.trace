package com.bobtrace.api.controller;

import com.bobtrace.api.dto.ImpactResponse;
import com.bobtrace.api.service.PromptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;

@RestController
@RequestMapping("/api/analise")
public class AnalysisController {

    @Autowired
    private PromptService promptService;

    @PostMapping("/impacto")
    public ImpactResponse analisar(@RequestBody String nomeClasse) {
        ImpactResponse response = new ImpactResponse();
        response.setClasseAlvo(nomeClasse);

        // Simulação de resposta para o Front testar
        response.setClassesAfetadas(Arrays.asList("PedidoController", "EstoqueService", "RelatorioRepository"));

        // Lógica de Risco Automática
        if (nomeClasse.contains("Controller")) {
            response.setRiscoTotal("ALTO");
        } else if (nomeClasse.contains("Service")) {
            response.setRiscoTotal("MÉDIO");
        } else {
            response.setRiscoTotal("BAIXO");
        }

        return response;
    }

    @PostMapping("/gerar-teste")
    public String gerarTeste(@RequestBody String nomeClasse) {
        return "import org.junit.jupiter.api.Test;\n" +
                "import static org.mockito.Mockito.*;\n\n" +
                "class " + nomeClasse + "Test {\n" +
                "    @Test\n" +
                "    void testGeradoPeloBob() {\n" +
                "        System.out.println(\"Teste para " + nomeClasse + "\");\n" +
                "    }\n" +
                "}";
    }
} // Verifique se essa última chave está presente!


