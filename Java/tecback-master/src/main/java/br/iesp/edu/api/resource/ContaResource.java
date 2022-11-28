package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Conta;
import br.iesp.edu.api.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaResource {

    @Autowired
    private ContaService service;

    @PostMapping
    public Conta salvar(@RequestBody @Valid Conta conta){
        return service.salvar(conta);
    }

    @PutMapping
    public Conta atualizar(@RequestBody @Valid Conta conta){
        return service.atualizar(conta);
    }

    @DeleteMapping
    public void excluir(@RequestBody Conta conta){
        service.excluir(conta);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Conta> listarConta(){
        return service.listarConta();
    }

}
