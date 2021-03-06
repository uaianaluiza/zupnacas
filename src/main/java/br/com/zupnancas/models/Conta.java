package br.com.zupnancas.models;

import br.com.zupnancas.enums.Status;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "contas")
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double valor;

    @Column
    private String descricao;
    private LocalDate dataDeSaida;
    private LocalDate dataVencimento;
    private Status statusEnum;

    @ManyToOne(optional = false)
    private Saldo saldo;


    public Conta(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(LocalDate dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Status getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(Status statusEnum) {
        this.statusEnum = statusEnum;
    }
}
