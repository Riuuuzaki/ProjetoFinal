/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject.model;

import com.mycompany.testeproject.persistence.entity.Tcolaborador;
import java.util.Date;

/**
 *
 * @author monisp
 */
public class Colaborador {
    Long nrColaborador;
    String nome;
    Date dataNasc;
    String nacionalidade;
    String numDoc;
    Date dataEmissaoDoc;
    Date dataFimDoc;
    Character estadoCivil;
    int nif;
    String nrSegSocial;
    String habLiteraria;
    Character cartaCond;
    String repartFinancas;

    public Colaborador() {
    }
    
    public Colaborador(Long nrColaborador, String nome, Date dataNasc, String nacionalidade, String numDoc, Date dataEmissaoDoc, Date dataFimDoc, Character estadoCivil, int nif, String nrSegSocial, String habLiteraria, Character cartaCond, String repartFinancas) {
        this.nrColaborador = nrColaborador;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.nacionalidade = nacionalidade;
        this.numDoc = numDoc;
        this.dataEmissaoDoc = dataEmissaoDoc;
        this.dataFimDoc = dataFimDoc;
        this.estadoCivil = estadoCivil;
        this.nif = nif;
        this.nrSegSocial = nrSegSocial;
        this.habLiteraria = habLiteraria;
        this.cartaCond = cartaCond;
        this.repartFinancas = repartFinancas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public Date getDataEmissaoDoc() {
        return dataEmissaoDoc;
    }

    public void setDataEmissaoDoc(Date dataEmissaoDoc) {
        this.dataEmissaoDoc = dataEmissaoDoc;
    }

    public Date getDataFimDoc() {
        return dataFimDoc;
    }

    public void setDataFimDoc(Date dataFimDoc) {
        this.dataFimDoc = dataFimDoc;
    }

    public Character getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Character estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getHabLiteraria() {
        return habLiteraria;
    }

    public void setHabLiteraria(String habLiteraria) {
        this.habLiteraria = habLiteraria;
    }

    public Character getCartaCond() {
        return cartaCond;
    }

    public void setCartaCond(Character cartaCond) {
        this.cartaCond = cartaCond;
    }

    public Long getNrColaborador() {
        return nrColaborador;
    }

    public void setNrColaborador(Long nrColaborador) {
        this.nrColaborador = nrColaborador;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getRepartFinancas() {
        return repartFinancas;
    }

    public void setRepartFinancas(String repartFinancas) {
        this.repartFinancas = repartFinancas;
    }

    public String getNrSegSocial() {
        return nrSegSocial;
    }

    public void setNrSegSocial(String nrSegSocial) {
        this.nrSegSocial = nrSegSocial;
    }
    
    public void buildFrom(Tcolaborador tcolaborador){
        this.setCartaCond(tcolaborador.getCartaCond());
        this.setDataEmissaoDoc(tcolaborador.getDataEmissaoDoc());
        this.setDataFimDoc(tcolaborador.getDataFimDoc());
        this.setDataNasc(tcolaborador.getDataNasc());
        this.setEstadoCivil(tcolaborador.getEstadoCivil());
        this.setHabLiteraria(tcolaborador.getHabLiteraria());
        this.setNacionalidade(tcolaborador.getNacionalidade());
        this.setNif(tcolaborador.getNif());
        this.setNome(tcolaborador.getNome());
        this.setNrColaborador(tcolaborador.getNrColaborador());
        this.setNumDoc(tcolaborador.getNumDoc());
        this.setRepartFinancas(tcolaborador.getRepartFinancas());
        this.setNrSegSocial(tcolaborador.getNrSegSocial());
    }
}
