package br.iesp.edu.api.repository;

import br.iesp.edu.api.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository
        extends JpaRepository<Categoria, Integer> {

}
