package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Idioma;
import br.iesp.edu.api.repository.IdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdiomaService {
    @Autowired
    private IdiomaRepository repository;

    public Idioma salvar(Idioma idioma){
        idioma = repository.save(idioma);
        return idioma;
    }

    public Idioma atualizar(Idioma idioma){
        if(idioma.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        idioma = repository.save(idioma);
        return idioma;
    }

    public void excluir(Idioma idioma){
        if(idioma.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(idioma);
    }


    public void excluirPorID(Integer id){
        repository.deleteById(id);
    }

    public List<Idioma> listarIdioma(){
        return repository.findAll();
    }
}
