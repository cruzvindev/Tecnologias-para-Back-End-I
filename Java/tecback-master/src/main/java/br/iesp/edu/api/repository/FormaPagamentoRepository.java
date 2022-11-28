package br.iesp.edu.api.repository;

import br.iesp.edu.api.entity.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagamentoRepository
        extends JpaRepository<FormaPagamento, Integer> {

}
