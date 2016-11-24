/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject;

import com.mycompany.testeproject.persistence.entity.Tcolaborador;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;

/**
 *
 * @author felicianoe
 */
@Component
public class ColaboradorDAO {

    @PersistenceContext
    private EntityManager em;

    public Tcolaborador getColaboradorByNrColaborador(long nrColaborador) {
        Query q = em.createNamedQuery("Tcolaborador.findByNrColaborador");
        q.setParameter("nrColaborador", nrColaborador);
        return (Tcolaborador) q.getSingleResult();
    }
}
