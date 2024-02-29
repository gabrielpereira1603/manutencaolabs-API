package com.manutencaolabs.controller.form;

import com.manutencaolabs.model.Computador;
import com.manutencaolabs.model.Laboratorio;
import com.manutencaolabs.model.Situacao;
import com.manutencaolabs.repository.RepositoryLaboratorio;
import com.manutencaolabs.repository.RepositorySituacao;

public class ComputadorForm {
    private Long codcomputador;

    private String patrimonio;

    private String numerolaboratorio;

    private String tiposituacao;

    public Long getCodcomputador() {
        return codcomputador;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public String getNumerolaboratorio() {
        return numerolaboratorio;
    }

    public String getTiposituacao() {
        return tiposituacao;
    }

    public void setCodcomputador(Long codcomputador) {
        this.codcomputador = codcomputador;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public void setNumerolaboratorio(String numerolaboratorio) {
        this.numerolaboratorio = numerolaboratorio;
    }

    public void setTiposituacao(String tiposituacao) {
        this.tiposituacao = tiposituacao;
    }

    public Computador converter(RepositoryLaboratorio rl, RepositorySituacao rs) {
        Laboratorio laboratorio = rl.findByNumerolaboratorio(numerolaboratorio);
        Situacao situacao = rs.findByTiposituacao(tiposituacao);
        return new Computador(patrimonio, laboratorio, situacao);
    }
}
