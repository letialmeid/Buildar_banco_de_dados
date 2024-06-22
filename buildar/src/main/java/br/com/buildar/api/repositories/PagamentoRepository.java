package br.com.buildar.api.repositories;

import br.com.buildar.api.models.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;
import java.util.List;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
    List<Pagamento> findAll();
}
