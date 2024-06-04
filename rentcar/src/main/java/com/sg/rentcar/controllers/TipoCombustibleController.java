package com.sg.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sg.rentcar.models.TipoCombustibles;
import com.sg.rentcar.models.Vehiculos;
import com.sg.rentcar.services.TipoCombustiblesService;

@Controller 
public class TipoCombustibleController {
	@Autowired
	private TipoCombustiblesService tipoCombustiblesService;
	

	@GetMapping("/combustibles")
	public String goCombustibles(Model model) {
		
		List<TipoCombustibles>tipoCombustiblesList = tipoCombustiblesService.getTipoCombustibles();
		model.addAttribute("combustibles", tipoCombustiblesList);
		
	    return "combustibles"; 
	}
	
	  @RequestMapping("addNew")	 
	    public String addNew(@ModelAttribute("combustibles") @RequestBody TipoCombustibles tipoCombustible) {
		  tipoCombustiblesService.save(tipoCombustible);
	    	return "redirect:/combustibles";
	    } 

}
