package com.manutencaolabs.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manutencaolabs.controller.form.ComputadorForm;
import com.manutencaolabs.model.Computador;
import com.manutencaolabs.repository.RepositoryComputador;
import com.manutencaolabs.repository.RepositoryLaboratorio;
import com.manutencaolabs.repository.RepositorySituacao;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/computadores")
public class ControllerComputador {


    @Autowired
    private RepositorySituacao repositorySituacao;

    @Autowired
    private RepositoryLaboratorio repositoryLaboratorio;

    @Autowired
    private RepositoryComputador repositoryComputador;

    private ComputadorForm form;

    @GetMapping
    public List<Computador> lista() {
        List<Computador> computadores = repositoryComputador.findAll();
        return computadores;
    }

    @GetMapping("/{id}")
    public Computador retornaComputadorId(@PathVariable Long id) {
        Computador computador = repositoryComputador.getOne(id);
        return computador;
    }

    @PostMapping("/add")
    public String salvarDados(@RequestBody ComputadorForm from) {
        this.form = from; 
        Computador computador = form.converter(repositoryLaboratorio, repositorySituacao);
        repositoryComputador.save(computador);
        return "dados salvo";
    }

    @GetMapping("/count/{id}")
    public ResponseEntity<Long> contarComputadoresPorLaboratorio(@PathVariable Long id) {
        // Lógica para contar computadores pelo laboratório com o código codLaboratorio
        long quantidade = repositoryComputador.countByLaboratorioCodlaboratorio(id);
        return ResponseEntity.ok(quantidade);
    }

    @GetMapping("/laboratorio/{id}")
    public List<Computador> listarComputadoresPorLaboratorio(@PathVariable Long id) {
        List<Computador> computadores = repositoryComputador.findByLaboratorioCodlaboratorio(id);
        return computadores;
    }
    
}