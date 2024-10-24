/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idat.app;

import com.idat.entity.Persona;
import com.idat.service.ServicePersona;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author IDAT
 */
@WebService(serviceName = "wsPersona")
public class wsPersona {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String nombre) {
        return "Daniel" + nombre + " !";
    }
    
    @WebMethod(operationName = "listadoPersona")
    public List<Persona> listadoPersona(){
        System.out.println(".....");
        ServicePersona servicio = new ServicePersona();
        Persona p = new Persona();
        p.setCodigo(0);
        p.setNombre("");
        p.setApellido("");
        List<Persona> lista = servicio.operacionLectura("ConsultarTodo", p);
        return lista;
    }
}
