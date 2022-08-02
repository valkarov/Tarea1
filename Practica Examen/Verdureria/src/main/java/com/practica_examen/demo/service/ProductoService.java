/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica_examen.demo.service;

import com.practica_examen.demo.entity.producto;
import com.practica_examen.demo.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aguil
 */

@Service
public class ProductoService implements IProductoService{
    
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<producto> getAllProducto() {
        return (List<producto>)productoRepository.findAll();
    }

     @Override
    public producto getProductoById(long id) {
        return productoRepository.findById(id).orElse(null); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void savePersona(producto persona) {
        productoRepository.save(persona); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(long id) {
        productoRepository.deleteById(id); //To change body of generated methods, choose Tools | Templates.
    }
}
