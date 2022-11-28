package br.iesp.edu.api.resource;


import br.iesp.edu.api.entity.Cep;
import br.iesp.edu.api.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CepResource {

	@Autowired
	CepService service;
	

	@GetMapping("/listacep/{cep}")
	public List<Cep> ListarCep(@PathVariable("cep") String cep ){

		return service.findByCep(cep);
		
	}
	
	@DeleteMapping("/deletar/{id}")
	public void DeletarCep(@PathVariable("id") Long Id) {
		
		 service.DeleteCep(Id);
	}
	
	
}
