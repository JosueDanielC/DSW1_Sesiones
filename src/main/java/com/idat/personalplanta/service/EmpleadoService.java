package com.idat.personalplanta.service;

import java.util.List;

import com.idat.personalplanta.model.Empleado;

public interface EmpleadoService {

    List<Empleado> listarEmpleados();
    void guardarEmpleado(Empleado empleado);
    Empleado obtenerEmpleadoPorId(Integer id);
    void eliminarEmpleado(Integer id);



}
