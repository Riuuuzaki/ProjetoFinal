/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject;

import com.mycompany.testeproject.persistence.entity.A;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author felicianoe
 */
@Component
public class Dao {

    @PersistenceContext
    private EntityManager em;

    public A getPerson() {
        return em.find(A.class, 1);
    }
}
