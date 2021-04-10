package br.com.zupnancas.dtos;

import br.com.zupnancas.models.Conta;
import br.com.zupnancas.models.Saldo;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

public class CadastrarContaDTO {

    @NotEmpty
    private String descricao;

    @NotNull
    private LocalDate dataDeVencimento;

    @Positive
    private double valor;

    @NotEmpty
    @CPF
    private String cpf;

    public CadastrarContaDTO(){

    }
    public CadastrarContaDTO(@NotEmpty String descricao, @Positive double valor, @NotNull LocalDate dataDeVencimento, @CPF @NotEmpty String cpf) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
        this.cpf = cpf;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
