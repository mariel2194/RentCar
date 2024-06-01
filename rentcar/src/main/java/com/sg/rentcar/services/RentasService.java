package com.sg.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.rentcar.models.Rentas;
import com.sg.rentcar.repositories.RentasRepository;

@Service
public class RentasService {
	@Autowired
	private RentasRepository rentasRepository;

	public List<Rentas> getRentas() {

		return rentasRepository.findAll();

	}
}
