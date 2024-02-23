package com.manutencaolabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manutencaolabs.model.Componente;

public interface RepositoryComponente extends JpaRepository<Componente, Long>{
    // Componente findfindByNome_componente(String nome_componente);
}
