/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author araujoav
 */
@Entity
@Table(name = "TAUSENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tausencia.findAll", query = "SELECT t FROM Tausencia t"),
    @NamedQuery(name = "Tausencia.findByTipoAusencia", query = "SELECT t FROM Tausencia t WHERE t.tipoAusencia = :tipoAusencia"),
    @NamedQuery(name = "Tausencia.findByDataInicio", query = "SELECT t FROM Tausencia t WHERE t.dataInicio = :dataInicio"),
    @NamedQuery(name = "Tausencia.findByDataFim", query = "SELECT t FROM Tausencia t WHERE t.dataFim = :dataFim"),
    @NamedQuery(name = "Tausencia.findByIsFeria", query = "SELECT t FROM Tausencia t WHERE t.isFeria = :isFeria"),
    @NamedQuery(name = "Tausencia.findByObs", query = "SELECT t FROM Tausencia t WHERE t.obs = :obs"),
    @NamedQuery(name = "Tausencia.findByNmAnexo", query = "SELECT t FROM Tausencia t WHERE t.nmAnexo = :nmAnexo"),
    @NamedQuery(name = "Tausencia.findByIdAusencia", query = "SELECT t FROM Tausencia t WHERE t.idAusencia = :idAusencia")})
public class Tausencia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TIPO_AUSENCIA")
    private String tipoAusencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA_FIM")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @Column(name = "IS_FERIA")
    private Character isFeria;
    @Size(max = 2000)
    @Column(name = "OBS")
    private String obs;
    @Size(max = 30)
    @Column(name = "NM_ANEXO")
    private String nmAnexo;
    @Lob
    @Column(name = "ANEXO")
    private Serializable anexo;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AUSENCIA")
    private Integer idAusencia;
    @JoinColumn(name = "NR_COLABORADOR", referencedColumnName = "NR_COLABORADOR")
    @ManyToOne(optional = false)
    private Tcolaborador nrColaborador;

    public Tausencia() {
    }

    public Tausencia(Integer idAusencia) {
        this.idAusencia = idAusencia;
    }

    public Tausencia(Integer idAusencia, String tipoAusencia, Date dataInicio, Date dataFim) {
        this.idAusencia = idAusencia;
        this.tipoAusencia = tipoAusencia;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public String getTipoAusencia() {
        return tipoAusencia;
    }

    public void setTipoAusencia(String tipoAusencia) {
        this.tipoAusencia = tipoAusencia;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Character getIsFeria() {
        return isFeria;
    }

    public void setIsFeria(Character isFeria) {
        this.isFeria = isFeria;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getNmAnexo() {
        return nmAnexo;
    }

    public void setNmAnexo(String nmAnexo) {
        this.nmAnexo = nmAnexo;
    }

    public Serializable getAnexo() {
        return anexo;
    }

    public void setAnexo(Serializable anexo) {
        this.anexo = anexo;
    }

    public Integer getIdAusencia() {
        return idAusencia;
    }

    public void setIdAusencia(Integer idAusencia) {
        this.idAusencia = idAusencia;
    }

    public Tcolaborador getNrColaborador() {
        return nrColaborador;
    }

    public void setNrColaborador(Tcolaborador nrColaborador) {
        this.nrColaborador = nrColaborador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAusencia != null ? idAusencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tausencia)) {
            return false;
        }
        Tausencia other = (Tausencia) object;
        if ((this.idAusencia == null && other.idAusencia != null) || (this.idAusencia != null && !this.idAusencia.equals(other.idAusencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.testeproject.persistence.entity.Tausencia[ idAusencia=" + idAusencia + " ]";
    }
    
}
