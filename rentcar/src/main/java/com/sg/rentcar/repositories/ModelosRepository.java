package com.sg.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.rentcar.models.Modelos;

@Repository
public interface ModelosRepository extends JpaRepository<Modelos, Integer> {

}
