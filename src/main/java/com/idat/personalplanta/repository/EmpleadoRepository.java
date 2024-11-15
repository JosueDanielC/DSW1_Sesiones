package com.idat.personalplanta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.personalplanta.model.Empleado;


@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer>{



}
