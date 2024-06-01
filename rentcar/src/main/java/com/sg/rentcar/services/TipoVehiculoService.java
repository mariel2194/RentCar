package com.sg.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.rentcar.models.TipoVehiculos;
import com.sg.rentcar.repositories.TipoVehiculoRepository;

@Service
public class TipoVehiculoService {

	@Autowired 
	private TipoVehiculoRepository tipoVehiculoRepository ; 
	
	
	public List<TipoVehiculos> getTipoVehiculos(){
		
		return tipoVehiculoRepository.findAll();
		
	}
}
