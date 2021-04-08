package br.com.zupnancas.dtos;

import br.com.zupnancas.enums.Status;
import br.com.zupnancas.models.Conta;

import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class ContaDTO {
    @Id
    private Integer id;
    @NotBlank
    private Double valor;
    private String descricao;
    private LocalDate dataDeSaida;
    private LocalDate dataVencimento;
    private Status statusEnum;

    public ContaDTO(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Conta converterDTOParaModel(){
        Conta conta = new Conta();

        conta.setDataDeSaida(this.dataDeSaida);
        conta.setDataVencimento(this.dataVencimento);
        conta.setStatusEnum(this.statusEnum);
        conta.setDescricao(this.descricao);
        conta.setValor(this.valor);
        conta.setId(this.id);

        return conta;
    }
}
