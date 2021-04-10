package br.com.zupnancas.controllers;

import br.com.zupnancas.models.Credito;
import br.com.zupnancas.services.CreditoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("creditos/")
public class CreditoController {

    private final CreditoService creditoService;

    @Autowired
    public CreditoController (CreditoService creditoService){
        this.creditoService = creditoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Credito cadastrarCredito(@RequestBody Credito credito){
        return creditoService.cadastrarCredito(credito);
    }
    @GetMapping
    public Iterable<Credito> verTodosOsCreditos(){
        return creditoService.verTodosOsCreditos();
    }

}
