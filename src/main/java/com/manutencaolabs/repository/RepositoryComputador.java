package com.manutencaolabs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manutencaolabs.model.Computador;

public interface RepositoryComputador extends JpaRepository<Computador, Long> {
    long countByLaboratorioCodlaboratorio(Long codLaboratorio);
    List<Computador> findByLaboratorioCodlaboratorio(Long codLaboratorio);

}