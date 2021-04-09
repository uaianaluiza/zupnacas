package br.com.zupnancas.services;

import br.com.zupnancas.models.Saldo;
import br.com.zupnancas.repositories.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SaldoService {

    @Autowired
    SaldoRepository saldoRepository;

    public Saldo cadastrarSaldo(Saldo saldo){
        return saldoRepository.save(saldo);
    }

    public Saldo buscarSaldoPorCpf(String cpf){
        Optional<Saldo> optionalSaldo = saldoRepository.findById(cpf);

        if ( optionalSaldo.isPresent()){
            return optionalSaldo.get();
        }
        throw new RuntimeException("CPF não cadastrado");
    }

    public Iterable<Saldo> visualizarSaldos(){

        return saldoRepository.findAll();
    }
}
