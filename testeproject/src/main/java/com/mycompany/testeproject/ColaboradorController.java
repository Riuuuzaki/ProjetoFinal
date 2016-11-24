/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject;

import com.mycompany.testeproject.model.Colaborador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author felicianoe
 */
@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {

    private ColaboradorDAO dao;

    @Autowired
    public ColaboradorController(ColaboradorDAO dao) {
        this.dao = dao;
    }

    @RequestMapping("/getColaborador")
    public Colaborador getColaborador(Long nrColaborador, Model model) {
        Colaborador colaborador = new Colaborador();
        colaborador.buildFrom(dao.getColaboradorByNrColaborador(Long.parseLong("5")));
        //Tcolaborador x = dao.getColaboradorByNrColaborador(nrColaborador);
        System.out.println(colaborador.getNome());
        model.addAttribute("get", colaborador);
        return colaborador;
    }
}
