package com.sg.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.rentcar.models.Rentas;

@Repository
public interface RentasRepository extends JpaRepository<Rentas, Integer> {

}
