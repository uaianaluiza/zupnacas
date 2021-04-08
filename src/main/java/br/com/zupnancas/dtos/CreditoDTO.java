package br.com.zupnancas.dtos;

import br.com.zupnancas.models.Categoria;
import br.com.zupnancas.models.Credito;
import br.com.zupnancas.models.Saldo;

import java.util.List;

public class CreditoDTO {
    private Double valor;
    private String descricao;
    private String cpf;
    private List<Categoria> categorias;

    public CreditoDTO(){
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Credito converterCadastrarCreditoDtoParaCredito() {
        Credito credito = new Credito();
        credito.setValor(this.valor);
        credito.setDescricao(this.descricao);
        Saldo saldo = new Saldo();
        saldo.setCPF(this.cpf);

        return credito;
    }
}
