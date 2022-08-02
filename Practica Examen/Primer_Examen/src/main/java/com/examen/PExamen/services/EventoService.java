/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.PExamen.services;

import com.examen.PExamen.modelo.Evento;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examen.PExamen.interfaces.EventorRepository;

/**
 *
 * @author aguil
 */
@Service
public class EventoService implements IEventoServices{
    
    @Autowired
    private EventorRepository data;
    
    @Override
    public List<Evento> listar() {
        return (List<Evento>)data.findAll();
    }

    @Override
    public Optional<Evento> listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int save(Evento e) {
        int res=0;
        Evento evento=data.save(e);
        if(!evento.equals(null)){
            res =1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
