package br.com.buildar.api.repositories;

import br.com.buildar.api.models.PagamentoStatus;

import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;
import java.util.List;

public interface PagamentoStatusRepository extends JpaRepository<PagamentoStatus, Integer> {
    List<PagamentoStatus> findAll();
}
