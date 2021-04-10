package br.com.zupnancas.controllers;

import br.com.zupnancas.models.Saldo;
import br.com.zupnancas.services.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("saldos/")
public class SaldoController {

   private final SaldoService saldoService;

    @Autowired
    public SaldoController(SaldoService saldoService){
        this.saldoService = saldoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Saldo cadastrarSaldo (Saldo saldo){
        return saldoService.cadastrarSaldo(saldo);
    }
    @GetMapping
    public Iterable<Saldo> verSaldos(){
        return saldoService.visualizarSaldos();
    }
}
