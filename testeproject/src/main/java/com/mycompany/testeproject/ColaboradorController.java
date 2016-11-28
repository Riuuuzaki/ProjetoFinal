/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.mycompany.testeproject.model.Colaborador;
import com.mycompany.testeproject.persistence.entity.Tcolaborador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author felicianoe
 */
@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {

    private ColaboradorDAO dao;
    private final static Logger log = LoggerFactory.getLogger(ColaboradorController.class);
    
    @Autowired
    public ColaboradorController(ColaboradorDAO dao) {
        this.dao = dao;
    }

    @RequestMapping(path="/getColaborador", method= RequestMethod.GET)
    public Colaborador getColaborador(Long nrColaborador, Model model) {
        Colaborador colaborador = Colaborador.buildFrom(dao.getColaboradorByNrColaborador(59));
        //Tcolaborador x = dao.getColaboradorByNrColaborador(nrColaborador);
        System.out.println(colaborador.getNome());
        model.addAttribute("get", colaborador);
        return colaborador;
    }
    
    @RequestMapping(path="/saveColaborador", method= RequestMethod.POST)
    public Tcolaborador saveColaborador(@RequestBody Colaborador colab) {
        log.info("ColaboradorController - A criar Colaborador " + colab.getNome());
        Tcolaborador saveColaborador = dao.saveColaborador(colab);
        
        return saveColaborador;
    }    
}
