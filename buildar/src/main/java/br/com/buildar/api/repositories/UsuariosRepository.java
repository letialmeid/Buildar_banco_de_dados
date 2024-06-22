package br.com.buildar.api.repositories;

import br.com.buildar.api.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<Usuarios, Integer> {
    List<Usuarios> findAll();
}
