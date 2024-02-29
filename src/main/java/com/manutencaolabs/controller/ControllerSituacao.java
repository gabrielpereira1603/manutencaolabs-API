package com.manutencaolabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manutencaolabs.model.Situacao;
import com.manutencaolabs.repository.RepositorySituacao;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/situacoes")
public class ControllerSituacao {
    
    @Autowired
    private RepositorySituacao repositorySituacao;

    @GetMapping 
    public List<Situacao> lista() {
        List<Situacao> situacoes = repositorySituacao.findAll();
        return situacoes;
    }
    
}
