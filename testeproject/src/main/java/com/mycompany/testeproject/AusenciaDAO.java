/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject;

import com.mycompany.testeproject.model.Ausencia;
import com.mycompany.testeproject.persistence.entity.Tausencia;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author araujoav
 */
@Component
public class AusenciaDAO {
    
    private final static Logger log = LoggerFactory.getLogger(AusenciaDAO.class);

    @PersistenceContext
    private EntityManager em;
    
    @Transactional
    public Tausencia addAus(Ausencia ausencia) {
        log.info("AusenciaDAO - inserir " + ausencia.getIdAusencia());
        Tausencia savedAusencia = null;
        
        
        boolean insert = savedAusencia == null;
        savedAusencia = Ausencia.updateToTausencia(savedAusencia, ausencia);
        if (insert) {
            savedAusencia = em.merge(savedAusencia);
        }
        return savedAusencia;
    }
    
    public Tausencia getAusenciaByIdAusencia(Integer idAusencia) {
        Query q = em.createNamedQuery("Tausencia.findByIdAusencia");
        q.setParameter("idAusencia", idAusencia);
        Ausencia ausencia = null;
        Tausencia savedAusencia = null;
        
        if (ausencia.getIdAusencia() != null) {
            savedAusencia = em.find(Tausencia.class, ausencia.getIdAusencia());
            return (Tausencia) q.getSingleResult();
        } else {
           return null;
        }                
    }
}