package com.sg.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sg.rentcar.models.TipoVehiculos;
import com.sg.rentcar.services.TipoVehiculoService;

@Controller 
public class TipoVehiculoController {
	
	@Autowired
	private TipoVehiculoService tipoVehiculoService;
	
	
    @GetMapping("/tipoVehiculos")
    public String goTipoVehiculos(Model model) {
    	
    	List<TipoVehiculos>tipoVehiculosList = tipoVehiculoService.getTipoVehiculos();
    	
    	model.addAttribute("tipoVehiculos", tipoVehiculosList);
    	
        return "tipoVehiculos"; 
    }

}
