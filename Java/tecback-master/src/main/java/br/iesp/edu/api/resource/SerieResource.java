package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Serie;
import br.iesp.edu.api.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieResource {

    @Autowired
    private SerieService service;

    @PostMapping
    public Serie salvar(@RequestBody @Valid Serie serie){
        return service.salvar(serie);
    }

    @PutMapping
    public Serie atualizar(@RequestBody @Valid Serie serie){
        return service.atualizar(serie);
    }

    @DeleteMapping
    public void excluir(@RequestBody Serie serie){
        service.excluir(serie);
    }
    @DeleteMapping("/{id}")  // localhost:8080/serie/45
    public void excluirPorId(@PathVariable Integer id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Serie> listarFilme(){
        return service.listarSeries();
    }



}