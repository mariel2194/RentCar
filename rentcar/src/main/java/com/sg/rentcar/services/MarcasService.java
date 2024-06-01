package com.sg.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.rentcar.models.Marcas;
import com.sg.rentcar.repositories.MarcasRepository;

@Service
public class MarcasService {

	@Autowired
	private MarcasRepository marcaRepository;

	public List<Marcas> getMarcas() {

		return marcaRepository.findAll();

	}

}
