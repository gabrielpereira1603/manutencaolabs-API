package com.manutencaolabs.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Laboratorio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codlaboratorio;
	@Column
    private String numerolaboratorio;

	@OneToMany
	private List<Computador> computadores;

	public Long getCodlaboratorio() {
		return codlaboratorio;
	}
	public void setCodlaboratorio(Long codlaboratorio) {
		this.codlaboratorio = codlaboratorio;
	}
	public String getNumerolaboratorio() {
		return numerolaboratorio;
	}
	public void setNumerolaboratorio(String numerolaboratorio) {
		this.numerolaboratorio = numerolaboratorio;
	}
	
	public Laboratorio() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
