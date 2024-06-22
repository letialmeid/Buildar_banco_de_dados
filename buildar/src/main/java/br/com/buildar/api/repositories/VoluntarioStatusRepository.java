package br.com.buildar.api.repositories;


import br.com.buildar.api.models.VoluntarioStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoluntarioStatusRepository extends JpaRepository<VoluntarioStatus, Integer> {
    List<VoluntarioStatus> findAll();
}
