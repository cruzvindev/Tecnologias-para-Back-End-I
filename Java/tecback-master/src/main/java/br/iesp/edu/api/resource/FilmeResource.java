package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Filme;
import br.iesp.edu.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeService service;

    @PostMapping
    public Filme salvar(@RequestBody @Valid Filme filme){

        return service.salvar(filme);
    }

    @PutMapping
    public Filme atualizar(@RequestBody @Valid Filme filme){
        return service.atualizar(filme);
    }

    @DeleteMapping
    public void excluir(@RequestBody Filme filme){
        service.excluir(filme);
    }
    @DeleteMapping("/{id}")  // localhost:8080/filme/45
    public void excluirPorId(@PathVariable Integer id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Filme> listarFilme(){
        return service.listarFilmes();
    }



}
