package br.com.buildar.api.repositories;

import br.com.buildar.api.models.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventosRepository extends JpaRepository<Eventos, Integer> {
    List<Eventos> findAll();
}
