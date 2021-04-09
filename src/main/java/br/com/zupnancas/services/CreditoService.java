package br.com.zupnancas.services;

import br.com.zupnancas.models.Credito;
import br.com.zupnancas.repositories.CreditoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CreditoService {
    @Autowired
    CreditoRepository creditoRepository;

    public Credito adicionarCredito(Credito credito){
        credito.setDataDeEntrada(LocalDate.now());
        Credito novoCredito = creditoRepository.save(credito);
        return novoCredito;
    }
}
