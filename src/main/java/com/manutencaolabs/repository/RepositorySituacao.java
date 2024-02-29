package com.manutencaolabs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manutencaolabs.model.Situacao;

public interface RepositorySituacao extends JpaRepository<Situacao, Long>{
    Situacao findByTiposituacao(String  tiposituacao);
}
