package br.com.zupnancas.models;

import org.springframework.cglib.core.Local;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditos")
public class Credito {
    @Id
    private int id;
    private double valor;
    private String descricao;
    private Local DataDeEntrada;

    public Credito(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Local getDataDeEntrada() {
        return DataDeEntrada;
    }

    public void setDataDeEntrada(Local dataDeEntrada) {
        DataDeEntrada = dataDeEntrada;
    }
}
