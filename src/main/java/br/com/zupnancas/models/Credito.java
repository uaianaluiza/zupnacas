package br.com.zupnancas.models;

import org.springframework.cglib.core.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "creditos")
public class Credito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double valor;
    private String descricao;
    private LocalDate DataDeEntrada;

    @ManyToOne
    private Saldo saldos;

    @ManyToMany
    private List<Categoria> categorias;


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

    public LocalDate getDataDeEntrada() {
        return DataDeEntrada;
    }

    public void setDataDeEntrada(LocalDate dataDeEntrada) {
        DataDeEntrada = dataDeEntrada;
    }
}
