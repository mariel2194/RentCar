package com.sg.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import com.sg.rentcar.models.Marcas;
import com.sg.rentcar.services.MarcasService;

@Controller 
public class MarcaController {

	@Autowired
	private MarcasService MarcaService;


	@GetMapping("/marcas")
	public String goMarcas(Model model) {
		
		List<Marcas>marcasList = MarcaService.getMarcas();
		model.addAttribute("marcas", marcasList);
		
	    return "marcas"; 
	}
}


