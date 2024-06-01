package com.sg.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sg.rentcar.models.Empleados;
import com.sg.rentcar.services.EmpleadosService;

@Controller 
public class EmpleadosController {
	@Autowired
	private EmpleadosService EmpleadosService;

	@GetMapping("/empleados")
	public String goRentas(Model model) {
		
		List<Empleados>rentasList = EmpleadosService.getEmpleados();
		model.addAttribute("empleados", rentasList);
		
	    return "empleados"; 
	}
}
