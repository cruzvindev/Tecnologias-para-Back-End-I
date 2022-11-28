package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.FormaPagamento;
import br.iesp.edu.api.service.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/FormaPagamento")

public class FormaPagamentoResource {


    @Autowired
    private FormaPagamentoService service;

    @PostMapping
    public FormaPagamento salvar(@RequestBody @Valid FormaPagamento formaPagamento){
        return service.salvar(formaPagamento);
    }

    @PutMapping
    public FormaPagamento atualizar(@RequestBody @Valid FormaPagamento formaPagamento){
        return service.atualizar(formaPagamento);
    }

    @DeleteMapping
    public void excluir(@RequestBody FormaPagamento formaPagamento){
        service.excluir(formaPagamento);
    }
    @DeleteMapping("/{id}")  // localhost:8080/formaPagamento/45
    public void excluirPorId(@PathVariable Integer id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<FormaPagamento> listarFormaPagamento(){
        return service.listarFormasPagamento();
    }



}
