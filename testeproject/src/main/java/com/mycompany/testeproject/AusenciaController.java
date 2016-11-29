/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeproject;
import com.mycompany.testeproject.model.Ausencia;
import com.mycompany.testeproject.persistence.entity.Tausencia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author araujoav
 */
@RestController
@RequestMapping("/ausencia")
public class AusenciaController {
    
    private AusenciaDAO dao;
    private final static Logger log = LoggerFactory.getLogger(AusenciaController.class);
    
    @Autowired
    public AusenciaController(AusenciaDAO dao) {
        this.dao = dao;
    }
    
    @RequestMapping(path="/addAus", method= RequestMethod.POST)
    public Tausencia addAus(@RequestBody Ausencia aus) {
        log.info("AusenciasController - A criar Ausencia " + aus.getIdAusencia());
        Tausencia saveAusencia = dao.addAus(aus);
        
        return saveAusencia;
    } 
    
    @RequestMapping(path="/getAus", method= RequestMethod.GET)
    public Ausencia getAus(Integer idAusencia, Model model) {
        Ausencia ausencia = Ausencia.buildFrom(dao.getAusenciaByIdAusencia(idAusencia));       
        System.out.println(ausencia.getIdAusencia());
        model.addAttribute("get", ausencia);
        return ausencia;
    }
}
