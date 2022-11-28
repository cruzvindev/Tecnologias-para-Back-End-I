package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Plano;
import br.iesp.edu.api.repository.PlanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoService {
    @Autowired
    private PlanoRepository repository;

    public Plano salvar(Plano plano){
        plano = repository.save(plano);
        return plano;
    }

    public Plano atualizar(Plano plano){
        if(plano.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        plano = repository.save(plano);
        return plano;
    }

    public void excluir(Plano plano){
        if(plano.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(plano);
    }


    public void excluirPorID(Integer id){
        repository.deleteById(id);
    }

    public List<Plano> listarPlano(){
        return repository.findAll();
    }
}
