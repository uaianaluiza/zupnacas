package br.com.zupnancas.services;

import br.com.zupnancas.models.Categoria;
import br.com.zupnancas.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria cadastrarCategoria (Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Iterable<Categoria> verCategoriasCadastradas(){
        return categoriaRepository.findAll();
    }

}
