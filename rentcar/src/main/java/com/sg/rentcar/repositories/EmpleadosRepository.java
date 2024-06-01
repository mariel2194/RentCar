package com.sg.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.rentcar.models.Empleados;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer> {

}
