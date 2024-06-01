package com.sg.rentcar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.rentcar.models.Empleados;
import com.sg.rentcar.repositories.EmpleadosRepository;

@Service
public class EmpleadosService {
	@Autowired
	private EmpleadosRepository empleadosRepository;

	public List<Empleados> getEmpleados() {

		return empleadosRepository.findAll();

	}

}
