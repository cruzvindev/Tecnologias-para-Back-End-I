package br.iesp.edu.api.resource;


import br.iesp.edu.api.entity.Plano;
import br.iesp.edu.api.service.PlanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/plano")
public class PlanoResource {
    @Autowired
    private PlanoService service;

    @PostMapping
    public Plano salvar(@RequestBody @Valid Plano plano){
        return service.salvar(plano);
    }

    @PutMapping
    public Plano atualizar(@RequestBody @Valid Plano plano){
        return service.atualizar(plano);
    }

    @DeleteMapping
    public void excluir(@RequestBody Plano plano){
        service.excluir(plano);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Plano> listarCategoria(){
        return service.listarPlano();
    }
}
