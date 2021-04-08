package br.com.zupnancas.models;


import javax.persistence.*;

@Entity
@Table(name = "saldos")
public class Saldo {

    @Id
    private String CPF;

    private Double valor;
    private Double limite;

    public Saldo(){

    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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
}
