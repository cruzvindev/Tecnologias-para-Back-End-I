package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.FormaPagamento;
import br.iesp.edu.api.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagamentoService {
    @Autowired
    private FormaPagamentoRepository repository;

    public FormaPagamento salvar(FormaPagamento formaPagamento) {
        formaPagamento = repository.save(formaPagamento);
        return formaPagamento;
    }

    public FormaPagamento atualizar(FormaPagamento formaPagamento) {
        if (formaPagamento.getId() == null) {
            throw new RuntimeException("ID Nulo");
        }
        formaPagamento = repository.save(formaPagamento);
        return formaPagamento;
    }

    public void excluir(FormaPagamento formaPagamento) {
        if (formaPagamento.getId() == null) {
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(formaPagamento);
    }


    public void excluirPorID(Integer id) {
        repository.deleteById(id);
    }

    public List<FormaPagamento> listarFormasPagamento() {
        return repository.findAll();
    }
}
