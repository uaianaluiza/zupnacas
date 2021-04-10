package br.com.zupnancas.controllers;

import br.com.zupnancas.dtos.CadastroDeCategoriaDTO;
import br.com.zupnancas.models.Categoria;
import br.com.zupnancas.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("categorias/")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @GetMapping
    public Iterable<Categoria> verCategoriasCadastradas(){
        return categoriaService.verCategoriasCadastradas();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria criarCategoria(@RequestBody @Valid CadastroDeCategoriaDTO cadastroDeCategoriaDTO){
        return categoriaService.cadastrarCategoria(cadastroDeCategoriaDTO.converterParaCategoria());
    }
}
