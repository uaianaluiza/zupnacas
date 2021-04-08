package br.com.zupnancas.repositories;

import br.com.zupnancas.models.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria,Integer> {
}
