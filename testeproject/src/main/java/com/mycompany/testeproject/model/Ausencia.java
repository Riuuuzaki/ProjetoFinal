/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject.model;

import com.mycompany.testeproject.persistence.entity.Tausencia;
import com.mycompany.testeproject.persistence.entity.Tcolaborador;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author araujoav
 */
public class Ausencia {
    
    private Integer idAusencia;
    private Tcolaborador nrColaborador;
    private String tpAusencia;
    private Date dtInicio;
    private Date dtFim;
    private Character isFeria;
    private String obs;
    private String nmAnexo;
    private Serializable anexo;

    public Ausencia() {
    }    
    
    public Ausencia(Integer idAusencia, Tcolaborador nrColaborador, String tpAusencia, Date dtInicio, Date dtFim, char isFeria, String obs, String nmAnexo, Serializable anexo) {
        this.idAusencia = idAusencia;
        this.nrColaborador = nrColaborador;
        this.tpAusencia = tpAusencia;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.isFeria = isFeria;
        this.obs = obs;
        this.nmAnexo = nmAnexo;
        this.anexo = anexo;
    }

    /**
     * @return the idAusencia
     */
    public Integer getIdAusencia() {
        return idAusencia;
    }

    /**
     * @param idAusencia the idAusencia to set
     */
    public void setIdAusencia(Integer idAusencia) {
        this.idAusencia = idAusencia;
    }

    /**
     * @return the nrColaborador
     */
    public Tcolaborador getNrColaborador() {
        return nrColaborador;
    }

    /**
     * @param nrColaborador the nrColaborador to set
     */
    public void setNrColaborador(Tcolaborador nrColaborador) {
        this.nrColaborador = nrColaborador;
    }

    /**
     * @return the tpAusencia
     */
    public String getTpAusencia() {
        return tpAusencia;
    }

    /**
     * @param tpAusencia the tpAusencia to set
     */
    public void setTpAusencia(String tpAusencia) {
        this.tpAusencia = tpAusencia;
    }

    /**
     * @return the dtInicio
     */
    public Date getDtInicio() {
        return dtInicio;
    }

    /**
     * @param dtInicio the dtInicio to set
     */
    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    /**
     * @return the dtFim
     */
    public Date getDtFim() {
        return dtFim;
    }

    /**
     * @param dtFim the dtFim to set
     */
    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    /**
     * @return the isFeria
     */
    public char getIsFeria() {
        return isFeria;
    }

    /**
     * @param isFeria the isFeria to set
     */
    public void setIsFeria(char isFeria) {
        this.isFeria = isFeria;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the nmAnexo
     */
    public String getNmAnexo() {
        return nmAnexo;
    }

    /**
     * @param nmAnexo the nmAnexo to set
     */
    public void setNmAnexo(String nmAnexo) {
        this.nmAnexo = nmAnexo;
    }

    /**
     * @return the anexo
     */
    public Serializable getAnexo() {
        return anexo;
    }

    /**
     * @param anexo the anexo to set
     */
    public void setAnexo(Serializable anexo) {
        this.anexo = anexo;
    }
    
    public static Tausencia updateToTausencia(Tausencia tausencia, Ausencia ausencia) {
        if (tausencia == null) {

            tausencia = new Tausencia();
        }
        
        tausencia.setTipoAusencia(ausencia.getTpAusencia());
        tausencia.setDataInicio(ausencia.getDtInicio());
        tausencia.setDataFim(ausencia.getDtFim());
        tausencia.setIsFeria(ausencia.getIsFeria());
        tausencia.setObs(ausencia.getObs());
        tausencia.setNmAnexo(ausencia.getNmAnexo());
        tausencia.setAnexo(tausencia.getAnexo());       
        tausencia.setNrColaborador(ausencia.getNrColaborador());
        return tausencia;
    }
    
    public static Ausencia buildFrom(Tausencia tausencia) {
        Ausencia aus = new Ausencia();
        
        aus.setTpAusencia(tausencia.getTipoAusencia());
        aus.setDtInicio(tausencia.getDataInicio());
        aus.setDtFim(tausencia.getDataFim());
        aus.setIsFeria(tausencia.getIsFeria());
        aus.setObs(tausencia.getObs());
        aus.setNmAnexo(tausencia.getNmAnexo());
        aus.setAnexo(tausencia.getAnexo());
        aus.setNrColaborador(tausencia.getNrColaborador());
        
        return aus;
    }
}
