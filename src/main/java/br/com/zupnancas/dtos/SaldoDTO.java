package br.com.zupnancas.dtos;

import br.com.zupnancas.models.Saldo;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SaldoDTO {
    @NotNull(message = "Favor informar o CPF")
    @NotEmpty(message = "O campo cpf está vazio")
    @CPF(message = "Este CPF inválido!")
    private String cpf;

    @NotNull(message = "Favor informar o valor")
    private Double valor;

    @NotNull(message = "Favor informar o limite")
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
