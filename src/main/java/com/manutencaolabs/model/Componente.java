package com.manutencaolabs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Componente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codcomponente;
    
    @Column
    private String nome_componente;

    public Long getCodcomponente() {
		return codcomponente;
	}
	public void setCodcomponente(Long codcomponente) {
		this.codcomponente = codcomponente;
	}
	public String getNome_componente() {
		return nome_componente;
	}
	public void setNome_componente(String nome_componente) {
		this.nome_componente = nome_componente;
	}
	public Componente() {
		super();
	}
	
}
