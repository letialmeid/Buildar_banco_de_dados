package br.com.buildar.api.repositories;

import br.com.buildar.api.models.Voluntarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoluntariosRepository extends JpaRepository<Voluntarios, Integer> {
    List<Voluntarios> findAll();
}
