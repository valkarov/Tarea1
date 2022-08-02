/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica_examen.demo.controller;

import com.practica_examen.demo.entity.producto;
import com.practica_examen.demo.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author aguil
 */
public class ProductoController {
    @Autowired
    private IProductoService productoService;
    
    @GetMapping("/Productos")
    public String index (Model model){
        List<producto> listaProducto = productoService.getAllProducto();
        model.addAttribute("titulo","Tabla Productos");
        model.addAttribute("productos", listaProducto);
        return "personas"; 
    }
}
