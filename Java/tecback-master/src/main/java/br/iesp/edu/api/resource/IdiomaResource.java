package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Idioma;
import br.iesp.edu.api.service.IdiomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/idioma")
public class IdiomaResource {
    @Autowired
    private IdiomaService service;

    @PostMapping
    public Idioma salvar(@RequestBody @Valid Idioma idioma){
        return service.salvar(idioma);
    }

    @PutMapping
    public Idioma atualizar(@RequestBody @Valid Idioma idioma){
        return service.atualizar(idioma);
    }

    @DeleteMapping
    public void excluir(@RequestBody Idioma idioma){
        service.excluir(idioma);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Idioma> listarIdioma(){
        return service.listarIdioma();
    }
}
