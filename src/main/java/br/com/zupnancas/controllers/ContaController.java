package br.com.zupnancas.controllers;

import br.com.zupnancas.models.Conta;
import br.com.zupnancas.services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("contas/")
public class ContaController {
    @Autowired
    private ContaService contaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Conta salvarConta(@RequestBody  Conta conta){
        return contaService.criarConta(conta);
    }
}
