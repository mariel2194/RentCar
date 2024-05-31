package com.sg.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.rentcar.models.Inspecciones;

@Repository
public interface EmpleadosRepository extends JpaRepository<Inspecciones, Integer> {

}
