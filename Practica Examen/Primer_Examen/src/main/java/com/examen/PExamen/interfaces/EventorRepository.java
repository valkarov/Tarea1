/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.PExamen.interfaces;

import com.examen.PExamen.modelo.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aguil
 */
@Repository
public interface EventorRepository extends CrudRepository<Evento, Integer>{
    
}
