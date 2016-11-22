/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject;

import com.mycompany.testeproject.persistence.entity.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author felicianoe
 */
@RestController
@RequestMapping("/person")
public class PersonsController {

    private Dao dao;

    @Autowired
    public PersonsController(Dao dao) {
        this.dao = dao;
    }

    @RequestMapping("/get")
    public A getPerson(Long id, Model model) {
        A x = dao.getPerson();
        model.addAttribute("get", x);
        return x;
    }
}
