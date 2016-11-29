/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject.persistence.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author monisp
 */
@Entity
@Table(name = "TCOLABORADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tcolaborador.findAll", query = "SELECT t FROM Tcolaborador t"),
    @NamedQuery(name = "Tcolaborador.findByNome", query = "SELECT t FROM Tcolaborador t WHERE t.nome = :nome"),
    @NamedQuery(name = "Tcolaborador.findByDataNasc", query = "SELECT t FROM Tcolaborador t WHERE t.dataNasc = :dataNasc"),
    @NamedQuery(name = "Tcolaborador.findByNacionalidade", query = "SELECT t FROM Tcolaborador t WHERE t.nacionalidade = :nacionalidade"),
    @NamedQuery(name = "Tcolaborador.findByNumDoc", query = "SELECT t FROM Tcolaborador t WHERE t.numDoc = :numDoc"),
    @NamedQuery(name = "Tcolaborador.findByDataEmissaoDoc", query = "SELECT t FROM Tcolaborador t WHERE t.dataEmissaoDoc = :dataEmissaoDoc"),
    @NamedQuery(name = "Tcolaborador.findByDataFimDoc", query = "SELECT t FROM Tcolaborador t WHERE t.dataFimDoc = :dataFimDoc"),
    @NamedQuery(name = "Tcolaborador.findByEstadoCivil", query = "SELECT t FROM Tcolaborador t WHERE t.estadoCivil = :estadoCivil"),
    @NamedQuery(name = "Tcolaborador.findByHabLiteraria", query = "SELECT t FROM Tcolaborador t WHERE t.habLiteraria = :habLiteraria"),
    @NamedQuery(name = "Tcolaborador.findByCartaCond", query = "SELECT t FROM Tcolaborador t WHERE t.cartaCond = :cartaCond"),
    @NamedQuery(name = "Tcolaborador.findByNrColaborador", query = "SELECT t FROM Tcolaborador t WHERE t.nrColaborador = :nrColaborador"),
    @NamedQuery(name = "Tcolaborador.findByNif", query = "SELECT t FROM Tcolaborador t WHERE t.nif = :nif"),
    @NamedQuery(name = "Tcolaborador.findByRepartFinancas", query = "SELECT t FROM Tcolaborador t WHERE t.repartFinancas = :repartFinancas"),
    @NamedQuery(name = "Tcolaborador.findByNrSegSocial", query = "SELECT t FROM Tcolaborador t WHERE t.nrSegSocial = :nrSegSocial")})

public class Tcolaborador implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nrColaborador")
    private Collection<Tausencia> tausenciaCollection;

    private final static Logger log = LoggerFactory.getLogger(Tcolaborador.class);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA_NASC")
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NACIONALIDADE")
    private String nacionalidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NUM_DOC")
    private String numDoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA_EMISSAO_DOC")
    @Temporal(TemporalType.DATE)
    private Date dataEmissaoDoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA_FIM_DOC")
    @Temporal(TemporalType.DATE)
    private Date dataFimDoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO_CIVIL")
    private Character estadoCivil;
    @Size(max = 30)
    @Column(name = "HAB_LITERARIA")
    private String habLiteraria;
    @Column(name = "CARTA_COND")
    private Character cartaCond;
    @Id
    @Column(name = "NR_COLABORADOR")
    @GeneratedValue(generator = "S_NR_COLABORADOR", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "S_NR_COLABORADOR", sequenceName = "S_NR_COLABORADOR", allocationSize = 1)
    private Long nrColaborador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NIF")
    private int nif;
    @Size(max = 20)
    @Column(name = "REPART_FINANCAS")
    private String repartFinancas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NR_SEG_SOCIAL")
    private String nrSegSocial;

    public Tcolaborador() {
    }

    public Tcolaborador(Long nrColaborador) {
        this.nrColaborador = nrColaborador;
    }

    public Tcolaborador(Long nrColaborador, String nome, Date dataNasc, String nacionalidade, String numDoc, Date dataEmissaoDoc, Date dataFimDoc, Character estadoCivil, int nif, String nrSegSocial) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrColaborador != null ? nrColaborador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tcolaborador)) {
            return false;
        }
        Tcolaborador other = (Tcolaborador) object;
        if ((this.nrColaborador == null && other.nrColaborador != null) || (this.nrColaborador != null && !this.nrColaborador.equals(other.nrColaborador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.testeproject.persistence.entity.Tcolaborador[ nrColaborador=" + nrColaborador + " ]";
    }

    @XmlTransient
    public Collection<Tausencia> getTausenciaCollection() {
        return tausenciaCollection;
    }

    public void setTausenciaCollection(Collection<Tausencia> tausenciaCollection) {
        this.tausenciaCollection = tausenciaCollection;
    }

}
