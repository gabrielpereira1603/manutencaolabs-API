package com.manutencaolabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manutencaolabs.model.Componente;
import com.manutencaolabs.repository.RepositoryComponente;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/componentes")
public class ControllerComponente {
    @Autowired
    private RepositoryComponente repositoryComponente;

    @GetMapping
	public List<Componente> lista() //DTO - Data Transfer Object
	{
        List<Componente> componentes = repositoryComponente.findAll();
        return componentes;
	}

    @GetMapping("/{id}")
	public Componente retornaComponenteId(@PathVariable Long id) {
		Componente componente = repositoryComponente.getOne(id);
		return componente;
	}
	
	@DeleteMapping("/{id}")
	public String deletaId(@PathVariable Long id) {
		
		repositoryComponente.deleteById(id);
		return "Campo deletado com id = "+id;
	}

    @PostMapping()
	public String salvarDados(@RequestBody Componente nome_componente) {
		
		repositoryComponente.save(nome_componente);
		return "Dados do Usuário salvos com sucesso!!";
	}
}
