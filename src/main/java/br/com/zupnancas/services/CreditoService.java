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
    CategoriaService categoriaService;

    public CreditoService (CreditoRepository creditoRepository, CategoriaService categoriaService){
        this.creditoRepository = creditoRepository;
        this.categoriaService = categoriaService;
    }

    public Credito cadastrarCredito (Credito credito){
        credito.setDataDeEntrada(LocalDate.now());
        return creditoRepository.save(credito);
    }

    public Iterable<Credito> verTodosOsCreditos(){
        return creditoRepository.findAll();
    }
}
