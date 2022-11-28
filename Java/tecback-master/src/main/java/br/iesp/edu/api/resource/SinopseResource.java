package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Sinopse;
import br.iesp.edu.api.service.SinopseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/sinopse")
public class SinopseResource {
    @Autowired
    private SinopseService service;

    @PostMapping
    public Sinopse salvar(@RequestBody @Valid Sinopse sinopse){
        return service.salvar(sinopse);
    }

    @PutMapping
    public Sinopse atualizar(@RequestBody @Valid Sinopse sinopse){
        return service.atualizar(sinopse);
    }

    @DeleteMapping
    public void excluir(@RequestBody Sinopse sinopse){
        service.excluir(sinopse);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Sinopse> listarSinopse(){
        return service.listarSinopse();
    }
}
