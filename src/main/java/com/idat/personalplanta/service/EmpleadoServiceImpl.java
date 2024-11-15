package com.idat.personalplanta.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.idat.personalplanta.model.Empleado;
import com.idat.personalplanta.repository.EmpleadoRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;



    @Override
    public void eliminarEmpleado(Integer id) {
        
        if (empleadoRepository.existsById(id)) {
            empleadoRepository.deleteById(id);
        }else{
            throw new RuntimeException("Empleado no encontrado por el id: " +  id);
        }
        
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
        
    }

    @Override
    public List<Empleado> listarEmpleados() {
        
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado obtenerEmpleadoPorId(Integer id) {
        
        return empleadoRepository.findById(id).orElseThrow(() -> new RuntimeException("Empleado no encontrado por el id:" + id));
    }

    

}
