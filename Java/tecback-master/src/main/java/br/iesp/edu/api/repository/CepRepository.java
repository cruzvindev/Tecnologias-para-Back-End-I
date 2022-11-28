package br.iesp.edu.api.repository;

import br.iesp.edu.api.entity.Cep;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CepRepository extends JpaRepository<Cep, Long> {

    List<Cep> findByCep(String cepString);

}


