package com.sg.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.rentcar.models.Modelos;
import com.sg.rentcar.repositories.ModelosRepository;

@Service
public class ModelosService {

	@Autowired
	private ModelosRepository modelosRepository;

	public List<Modelos> getModelos() {

		return modelosRepository.findAll();

	}
}
