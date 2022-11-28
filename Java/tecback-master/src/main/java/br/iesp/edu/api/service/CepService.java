package br.iesp.edu.api.service;
import br.iesp.edu.api.entity.Cep;
import br.iesp.edu.api.repository.CepRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.client.RestTemplate;

import java.util.List;


@org.springframework.stereotype.Service
public class CepService {
	
	@Autowired
	CepRepository repository;
	
	public List<Cep> findByCep(String cep) {
	
	cep = cep.replace("-", "");	
	System.out.println(cep);
	List<Cep> retorno = repository.findByCep(cep);

	if(retorno.isEmpty()){
		ConsultaViacep(cep);
	}
	return repository.findByCep(cep);
  }

  	public Cep ConsultaViacep(String cep){
		RestTemplate restTemplate = new RestTemplate();
		Cep modelCep = restTemplate.getForObject("https://viacep.com.br/ws/"+cep+"/json/", Cep.class);
		modelCep.setCep(cep.replace("-", ""));
		Gson gson = new Gson();
		String Json = gson.toJson(modelCep);
		System.out.println(Json);
		InsertCep(modelCep);	
		return modelCep;
	  }
	
	public void InsertCep(Cep model) {
		repository.save(model);
		System.out.println("CEP INSERIDO NA BASE : "+model.cep);	
	}
	
	public void DeleteCep(Long Id) {
		Cep Entity = repository.getById(Id);
		System.out.println(Entity.cep+" Cep deletado da base");
		repository.delete(Entity);
		
	}
}
