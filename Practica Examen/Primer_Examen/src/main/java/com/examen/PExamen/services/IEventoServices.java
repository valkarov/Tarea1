/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.PExamen.services;

import com.examen.PExamen.modelo.Evento;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author aguil
 */
public interface IEventoServices {
    public List<Evento>listar();
    public Optional<Evento>listarId(int id);
    public int save(Evento e);
    public void delete(int id);
}
