package com.sg.rentcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.rentcar.models.TipoCombustibles;

@Repository
public interface TipoCombustibleRepository extends JpaRepository<TipoCombustibles, Integer> {

}
