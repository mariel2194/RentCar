package com.sg.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sg.rentcar.models.TipoCombustibles;
import com.sg.rentcar.services.TipoCombustiblesService;

@Controller 
public class TipoCombustibleController {
	@Autowired
	private TipoCombustiblesService tipoCombustibles;

	@GetMapping("/combustibles")
	public String goModelos(Model model) {
		
		List<TipoCombustibles>tipoCombustiblesList = tipoCombustibles.getTipoCombustibles();
		model.addAttribute("combustibles", tipoCombustiblesList);
		
	    return "combustibles"; 
	}

}
