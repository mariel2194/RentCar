package com.sg.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.rentcar.models.Inspecciones;
import com.sg.rentcar.repositories.InspeccionesRepository;

@Service
public class InspeccionesService {

	@Autowired
	private InspeccionesRepository inspeccionesRepository;

	public List<Inspecciones> getInspecciones() {

		return inspeccionesRepository.findAll();

	}

}
