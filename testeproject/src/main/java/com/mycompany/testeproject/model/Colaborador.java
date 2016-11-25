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

    public static Colaborador buildFrom(Tcolaborador tcolaborador) {
        Colaborador colab = new Colaborador();
        colab.setCartaCond(tcolaborador.getCartaCond());
        colab.setDataEmissaoDoc(tcolaborador.getDataEmissaoDoc());
        colab.setDataFimDoc(tcolaborador.getDataFimDoc());
        colab.setDataNasc(tcolaborador.getDataNasc());
        colab.setEstadoCivil(tcolaborador.getEstadoCivil());
        colab.setHabLiteraria(tcolaborador.getHabLiteraria());
        colab.setNacionalidade(tcolaborador.getNacionalidade());
        colab.setNif(tcolaborador.getNif());
        colab.setNome(tcolaborador.getNome());
        colab.setNrColaborador(tcolaborador.getNrColaborador());
        colab.setNumDoc(tcolaborador.getNumDoc());
        colab.setRepartFinancas(tcolaborador.getRepartFinancas());
        colab.setNrSegSocial(tcolaborador.getNrSegSocial());
        return colab;
    }

    public static Tcolaborador buildToTcolaborador(Colaborador colaborador) {
        Tcolaborador tcolaborador = new Tcolaborador();
        tcolaborador.setCartaCond(colaborador.getCartaCond());
        tcolaborador.setDataEmissaoDoc(colaborador.getDataEmissaoDoc());
        tcolaborador.setDataFimDoc(colaborador.getDataFimDoc());
        tcolaborador.setDataNasc(colaborador.getDataNasc());
        tcolaborador.setEstadoCivil(colaborador.getEstadoCivil());
        tcolaborador.setHabLiteraria(colaborador.getHabLiteraria());
        tcolaborador.setNacionalidade(colaborador.getNacionalidade());
        tcolaborador.setNif(colaborador.getNif());
        tcolaborador.setNome(colaborador.getNome());
        tcolaborador.setNrColaborador(colaborador.getNrColaborador());
        tcolaborador.setNumDoc(colaborador.getNumDoc());
        tcolaborador.setRepartFinancas(colaborador.getRepartFinancas());
        tcolaborador.setNrSegSocial(colaborador.getNrSegSocial());
        return tcolaborador;
    }

    public static Tcolaborador updateToTcolaborador(Tcolaborador tcolaborador, Colaborador colaborador) {
        if (tcolaborador == null) {

            tcolaborador = new Tcolaborador();
        }
        tcolaborador.setCartaCond(colaborador.getCartaCond());
        tcolaborador.setDataEmissaoDoc(colaborador.getDataEmissaoDoc());
        tcolaborador.setDataFimDoc(colaborador.getDataFimDoc());
        tcolaborador.setDataNasc(colaborador.getDataNasc());
        tcolaborador.setEstadoCivil(colaborador.getEstadoCivil());
        tcolaborador.setHabLiteraria(colaborador.getHabLiteraria());
        tcolaborador.setNacionalidade(colaborador.getNacionalidade());
        tcolaborador.setNif(colaborador.getNif());
        tcolaborador.setNome(colaborador.getNome());
        tcolaborador.setNumDoc(colaborador.getNumDoc());
        tcolaborador.setRepartFinancas(colaborador.getRepartFinancas());
        tcolaborador.setNrSegSocial(colaborador.getNrSegSocial());
        return tcolaborador;
    }
}
