package com.sg.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.rentcar.models.Marcas;
import com.sg.rentcar.repositories.InspeccionesRepository;

@Service
public class InspeccionesService {

	@Autowired
	private MarcasRepository InspeccionesRepository;

	public List<Inspecciones> getMarcas() {

		return marcaRepository.findAll();

	}

}
