package com.sg.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sg.rentcar.models.Modelos;
import com.sg.rentcar.services.ModelosService;

@Controller 
public class ModelosController {
	
	@Autowired
	private ModelosService ModelosService;

	@GetMapping("/modelos")
	public String goModelos(Model model) {
		
		List<Modelos>modelosList = ModelosService.getModelos();
		model.addAttribute("modelos", modelosList);
		
	    return "modelos"; 
	}

}


