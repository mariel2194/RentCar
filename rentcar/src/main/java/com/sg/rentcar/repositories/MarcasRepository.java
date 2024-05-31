package com.sg.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.rentcar.models.Marcas;

@Repository
public interface MarcasRepository extends JpaRepository<Marcas, Integer> {

}
