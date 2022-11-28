package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Categoria;
import br.iesp.edu.api.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaResource {

    @Autowired
    private CategoriaService service;

    @PostMapping
    public Categoria salvar(@RequestBody @Valid Categoria categoria){
        return service.salvar(categoria);
    }

    @PutMapping
    public Categoria atualizar(@RequestBody @Valid Categoria categoria){
        return service.atualizar(categoria);
    }

    @DeleteMapping
    public void excluir(@RequestBody Categoria categoria){
        service.excluir(categoria);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Categoria> listarCategoria(){
        return service.listarCategoria();
    }

}
