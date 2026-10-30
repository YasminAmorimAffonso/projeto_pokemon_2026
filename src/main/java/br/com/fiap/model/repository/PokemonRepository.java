package br.com.fiap.model.repository;

import br.com.fiap.model.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

    Pokemon findByCodigo(Long codigo);

}
