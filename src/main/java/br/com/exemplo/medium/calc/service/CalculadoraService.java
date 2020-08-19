package br.com.exemplo.medium.calc.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CalculadoraService {

    public Double calcula(Double primeiroNumero,
                          String operacao,
                          Double segundoNumero){
        if("soma".equals(operacao)){
            return primeiroNumero + segundoNumero;
        }
        if("subtracao".equals(operacao)){
            return primeiroNumero - segundoNumero;
        }
        if("multiplicacao".equals(operacao)){
            return primeiroNumero * segundoNumero;
        }
        if("divisao".equals(operacao)){
            return primeiroNumero / segundoNumero;
        }
        throw new IllegalArgumentException("Operação invalida");
    }
}
