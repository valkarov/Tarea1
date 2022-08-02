/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica_examen.demo.service;

import com.practica_examen.demo.entity.producto;
import java.util.List;
/**
 *
 * @author aguil
 */
public interface IProductoService {
    public List<producto> getAllProducto();
    public producto getProductoById (long id);
    public void savePersona (producto producto);
    public void delete (long id);
}
