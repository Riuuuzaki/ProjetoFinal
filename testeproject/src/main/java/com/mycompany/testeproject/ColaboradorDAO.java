/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject;

import com.mycompany.testeproject.model.Colaborador;
import com.mycompany.testeproject.persistence.entity.Tcolaborador;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author felicianoe
 */
@Component
public class ColaboradorDAO {

    private final static Logger log = LoggerFactory.getLogger(ColaboradorDAO.class);

    @PersistenceContext
    private EntityManager em;

    public Tcolaborador getColaboradorByNrColaborador(long nrColaborador) {
        Query q = em.createNamedQuery("Tcolaborador.findByNrColaborador");
        q.setParameter("nrColaborador", nrColaborador);
        return (Tcolaborador) q.getSingleResult();
    }

    @Transactional
    public Tcolaborador saveColaborador(Colaborador colaborador) {
        log.info("ColaboradorDAO - inserir " + colaborador.getNome());
        Tcolaborador savedColaborador = null;
        if (colaborador.getNrColaborador() != null) {

            savedColaborador = em.find(Tcolaborador.class, colaborador.getNrColaborador());
        }
        boolean insert = savedColaborador == null;
        savedColaborador = Colaborador.updateToTcolaborador(savedColaborador, colaborador);
        if (insert) {
            savedColaborador = em.merge(savedColaborador);
        }
        return savedColaborador;
    }
}
