package br.com.zupnancas.dtos;

import br.com.zupnancas.models.Categoria;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CategoriaDTO {
    @NotNull(message = "Favor informar o nome")
    @NotBlank(message = "O campo nome não pode ser vazio nem nulo")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria converterCategoriaDtoParaCategoria() {
        Categoria categoria = new Categoria();
        categoria.setNome(this.nome);
        return categoria;
    }
}
