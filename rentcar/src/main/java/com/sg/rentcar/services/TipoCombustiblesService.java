package com.sg.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sg.rentcar.models.TipoCombustibles;
import com.sg.rentcar.models.Vehiculos;
import com.sg.rentcar.repositories.TipoCombustibleRepository;

@Service
public class TipoCombustiblesService {
	@Autowired
	private TipoCombustibleRepository tipoCombustibleRepository;

	public List<TipoCombustibles> getTipoCombustibles() {
		return tipoCombustibleRepository.findAll();

	}
	
	 
	public void save(TipoCombustibles tipoCombustible) {
		tipoCombustibleRepository.save(tipoCombustible);  
	}

}

