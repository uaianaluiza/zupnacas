package br.com.zupnancas.dtos;

import br.com.zupnancas.enums.Status;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class ContaDTO {
    @Id
    private Integer id;
    @NotNull
    private Double valor;
    private String descricao;
    private LocalDate dataDeSaida;
    private LocalDate dataVencimento;
    private Status statusEnum;
}
