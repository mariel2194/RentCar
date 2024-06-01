package com.sg.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sg.rentcar.models.Rentas;
import com.sg.rentcar.services.RentasService;

@Controller 
public class RentasController {
	@Autowired
	private RentasService RentasService;

	@GetMapping("/rentas")
	public String goRentas(Model model) {
		
		List<Rentas>rentasList = RentasService.getRentas();
		model.addAttribute("rentas", rentasList);
		
	    return "rentas"; 
	}

}
