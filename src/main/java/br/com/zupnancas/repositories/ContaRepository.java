package br.com.zupnancas.repositories;

import br.com.zupnancas.enums.Status;
import br.com.zupnancas.models.Conta;
import org.springframework.data.repository.CrudRepository;

public interface ContaRepository extends CrudRepository<Conta,Integer> {
    Iterable<Conta> findByStatus(Status status);

}
