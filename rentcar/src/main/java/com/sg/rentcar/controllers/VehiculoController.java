package com.sg.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.sg.rentcar.models.Vehiculos;
import org.springframework.ui.Model;

import com.sg.rentcar.services.VehiculosService;


@Controller 
public class VehiculoController {
    
	@Autowired
	private VehiculosService vehiculoService;
	
	
    @GetMapping("/vehiculos")
    public String goVehiculos(Model model) {
    	
    	List<Vehiculos>vehiculosList = vehiculoService.getVehiculos();
    	
    	model.addAttribute("vehiculos", vehiculosList);
    	
        return "vehiculos"; 
    }
}

