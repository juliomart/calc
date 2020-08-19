package br.com.exemplo.medium.calc.controller;

import br.com.exemplo.medium.calc.service.CalculadoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
@RequiredArgsConstructor
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    @GetMapping("/{primeiroNumero}/{operacao}/{segundoNumero}")
    public Double soma(@PathVariable Double primeiroNumero,
                       @PathVariable String operacao,
                       @PathVariable Double segundoNumero) {
        return calculadoraService.calcula(primeiroNumero, operacao, segundoNumero);
    }
}
