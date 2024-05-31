package com.sg.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.rentcar.models.Vehiculos;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculos, Integer> {

}
