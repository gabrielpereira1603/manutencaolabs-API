package com.manutencaolabs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Computador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codcomputador;

    @Column
    private String patrimonio;

    @ManyToOne
    @JoinColumn(name = "codsituacao_fk") 
    private Situacao situacao;

    @ManyToOne
    @JoinColumn(name = "codlaboratorio_fk") 
    private Laboratorio laboratorio;

    public Long getCodcomputador() {
        return codcomputador;
    }

    public void setCodcomputador(Long codcomputador) {
        this.codcomputador = codcomputador;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao){
        this.situacao = situacao;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
 
    public void setLaboratorio(Laboratorio laboratorio){
        this.laboratorio = laboratorio;
    }

    public Computador() {
        super();
    }

    public Computador(String patrimonio, Laboratorio laboratorio, Situacao situacao) {
        super();
        this.patrimonio = patrimonio;
        this.laboratorio = laboratorio;
        this.situacao = situacao;
    }

}
