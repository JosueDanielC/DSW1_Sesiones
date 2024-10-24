/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idat.service;
import com.idat.dao.IPersonaDao;
import com.idat.dao.daoImpl.PersonaDaoImpl;
import com.idat.entity.Persona;
import java.util.List;

/**
 *
 * @author IDAT
 */
public class ServicePersona {
    
    public int operacionEscritura(String indicador, Persona p){
        IPersonaDao dao = new PersonaDaoImpl();
        return dao.operacionEscritura(indicador, p);
        
        
    }
    
    public List<Persona> operacionLectura(String indicador, Persona p){
        
        IPersonaDao dao = new PersonaDaoImpl();
        return dao.operacionLectura(indicador, p);
    }
    
}
