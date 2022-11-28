package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Conta;
import br.iesp.edu.api.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    @Autowired
    private ContaRepository repository;

    public Conta salvar(Conta conta){
        conta = repository.save(conta);
        return conta;
    }

    public Conta atualizar(Conta conta){
        if(conta.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        conta = repository.save(conta);
        return conta;
    }

    public void excluir(Conta conta){
        if(conta.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(conta);
    }


    public void excluirPorID(Integer id){
        repository.deleteById(id);
    }

    public List<Conta> listarConta(){
        return repository.findAll();
    }

}
