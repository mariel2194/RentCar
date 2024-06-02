package com.sg.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sg.rentcar.models.Inspecciones;
import com.sg.rentcar.services.InspeccionesService;

@Controller 
public class InspeccionesController {
	@Autowired
	private InspeccionesService inspeccionessService;

	@GetMapping("/inspecciones")
	public String goRentas(Model model) {
		
		List<Inspecciones>inspeccionesList = InspeccionesService.getInspecciones();
		model.addAttribute("inspecciones", inspeccionesList);
		
	    return "inspecciones"; 
	}

}
