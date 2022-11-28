package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Categoria;
import br.iesp.edu.api.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public Categoria salvar(Categoria categoria){
        categoria = repository.save(categoria);
        return categoria;
    }

    public Categoria atualizar(Categoria categoria){
        if(categoria.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        categoria = repository.save(categoria);
        return categoria;
    }

    public void excluir(Categoria categoria){
        if(categoria.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(categoria);
    }


    public void excluirPorID(Integer id){
        repository.deleteById(id);
    }

    public List<Categoria> listarCategoria(){
        return repository.findAll();
    }

}
