/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practica_examen.demo.repository;

import com.practica_examen.demo.entity.producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aguil
 */
@Repository
public interface ProductoRepository extends CrudRepository<producto, Long> {
    
}
