package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Sinopse;
import br.iesp.edu.api.repository.SinopseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinopseService {
    @Autowired
    private SinopseRepository repository;

    public Sinopse salvar(Sinopse sinopse){
        sinopse = repository.save(sinopse);
        return sinopse;
    }

    public Sinopse atualizar(Sinopse sinopse){
        if(sinopse.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        sinopse = repository.save(sinopse);
        return sinopse;
    }

    public void excluir(Sinopse sinopse){
        if(sinopse.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(sinopse);
    }


    public void excluirPorID(Integer id){
        repository.deleteById(id);
    }

    public List<Sinopse> listarSinopse(){
        return repository.findAll();
    }
}
