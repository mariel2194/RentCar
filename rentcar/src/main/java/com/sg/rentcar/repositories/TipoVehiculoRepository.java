package com.sg.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.rentcar.models.TipoVehiculos;

@Repository
public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculos, Integer> {

}
