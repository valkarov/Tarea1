/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.PExamen.controler;

import com.examen.PExamen.modelo.Evento;
import com.examen.PExamen.services.IEventoServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author aguil
 */
@Controller
public class Controlador {
    
    @Autowired
    private IEventoServices service;
   
    @GetMapping("/listar")
    public String listar(Model model){
        List<Evento>evento = service.listar();
        model.addAttribute("eventos", evento);
        return "index";
    }
    
    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("evento", new Evento());
        return "form";
    }
    
    @PostMapping("/save")
    public String save( @Validated Evento e ,Model model){
        service.save(e);
        return "redirect:/listar";
    }
}
