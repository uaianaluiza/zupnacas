package br.com.zupnancas.dtos;

import br.com.zupnancas.models.Saldo;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SaldoDTO {
    @NotNull(message = "O campo cpf deve ser informado!")
    @NotEmpty(message = "o campo cpf está vazio")
    @CPF(message = "CPF inválido!")
    private String cpf;

    @NotNull(message = "O campo valor deve ser informado!")
    private Double valor;

    @NotNull(message = "O campo limite deve ser informado!")
    @Min(value = 0, message = "o valor do limite deve ser maior do que zero!")
    private Double limite;

    public SaldoDTO(){
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Saldo converterSaldoDTOParaSaldo() {
        Saldo saldo = new Saldo();
        saldo.setCPF(this.cpf);
        saldo.setValor(this.valor);
        saldo.setLimite(this.limite);

        return saldo;
    }
}
