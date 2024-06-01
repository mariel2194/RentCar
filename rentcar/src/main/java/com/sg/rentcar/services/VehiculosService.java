package com.sg.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.rentcar.models.Vehiculos;
import com.sg.rentcar.repositories.VehiculoRepository;

@Service
public class VehiculosService {
	
	@Autowired 
	private VehiculoRepository vehiculoRepository ; 
	
	
	public List<Vehiculos> getVehiculos(){
		
		return vehiculoRepository.findAll();
		
	}

}
