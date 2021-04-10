package br.com.zupnancas.controllers;

import br.com.zupnancas.services.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("saldos/")
public class SaldoController {

    @Autowired
    public SaldoService saldoService;

    public SaldoController(SaldoService saldoService){
        this.saldoService = saldoService;
    }
}
