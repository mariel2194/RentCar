package com.sg.rentcar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class VehiculoController {
	
	 @GetMapping("/vehiculos")
	    public String index() {
	        return "vehiculos"; 
	    }

}
