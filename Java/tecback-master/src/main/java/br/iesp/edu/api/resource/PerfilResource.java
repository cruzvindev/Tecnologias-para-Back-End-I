package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Perfil;
import br.iesp.edu.api.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/perfil")
public class PerfilResource {
    @Autowired
    private PerfilService service;

    @PostMapping
    public Perfil salvar(@RequestBody @Valid Perfil perfil){
        return service.salvar(perfil);
    }

    @PutMapping
    public Perfil atualizar(@RequestBody @Valid Perfil perfil){
        return service.atualizar(perfil);
    }

    @DeleteMapping
    public void excluir(@RequestBody Perfil perfil){
        service.excluir(perfil);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Integer id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Perfil> listarPerfil(){
        return service.listarPerfil();
    }
}
