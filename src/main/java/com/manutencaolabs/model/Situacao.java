package com.manutencaolabs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Situacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codsituacao;
        
    @Column
    private String tiposituacao;

    public Long getCodsituacao() {
        return codsituacao;
    }

    public void setCodsituacao(Long codsituacao) {
        this.codsituacao = codsituacao;
    }

    public String getTiposituacao() {
        return tiposituacao;
    }
    
    public void setTiposituacao(String tiposituacao) {
        this.tiposituacao = tiposituacao;
    }
    
    public Situacao() {
        super();
    }
}
