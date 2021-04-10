package br.com.zupnancas.services;

import br.com.zupnancas.models.Categoria;
import br.com.zupnancas.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria cadastrarCategoria (Categoria categoria){
        return categoriaRepository.save(categoria);
    }
    public Categoria buscarCategoriaPeloId(int id){
        Optional<Categoria> optionalCategoria = categoriaRepository.findById(id);

        if(optionalCategoria.isPresent()){
            return optionalCategoria.get();
        }
        throw new RuntimeException("Categoria não cadastrada");
    }

    public Iterable<Categoria> verCategoriasCadastradas(){

        return categoriaRepository.findAll();
    }

    public void deletarCategoriaPeloID(int id){
        buscarCategoriaPeloId(id);
        categoriaRepository.deleteById(id);
    }

}
