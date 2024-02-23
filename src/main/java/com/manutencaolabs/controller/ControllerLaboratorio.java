package com.manutencaolabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manutencaolabs.model.Laboratorio;
import com.manutencaolabs.repository.RepositoryLaboratorio;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/laboratorios")
public class ControllerLaboratorio {

	@Autowired
    private RepositoryLaboratorio repositoryLaboratorio;

	@GetMapping
	public List<Laboratorio> lista() //DTO - Data Transfer Object
	{
			List<Laboratorio> laboratorios = repositoryLaboratorio.findAll();
			return laboratorios;
	}
}
