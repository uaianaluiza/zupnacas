package br.com.zupnancas.dtos;

import br.com.zupnancas.models.Categoria;

import javax.validation.constraints.NotEmpty;

public class CadastroDeCategoriaDTO {
    @NotEmpty
    private String nome;

    public CadastroDeCategoriaDTO(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria converterParaCategoria(){
        Categoria categoria = new Categoria();
        categoria.setNome(this.nome);
        return categoria;
    }
}
