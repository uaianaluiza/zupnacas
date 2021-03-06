package br.com.zupnancas.services;

import br.com.zupnancas.models.Conta;
import br.com.zupnancas.repositories.ContaRepository;
import br.com.zupnancas.repositories.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;
    private SaldoRepository saldoRepository;

    public Conta criarConta(Conta conta){
        Conta objetoConta = contaRepository.save(conta);
        return objetoConta;
    }
}
