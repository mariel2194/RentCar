package com.sg.rentcar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sg.rentcar.models.TipoVehiculos;
import com.sg.rentcar.models.Vehiculos;
import org.springframework.ui.Model;

import com.sg.rentcar.services.TipoVehiculoService;
import com.sg.rentcar.services.VehiculosService;

@Controller
public class VehiculoController {

    @Autowired
    private VehiculosService vehiculoService;

    @Autowired
    private TipoVehiculoService tipoVehiculoService;

    @GetMapping("/vehiculos")
    public String showVehiculos(Model model) {
        List<Vehiculos> vehiculosList = vehiculoService.getVehiculos();
        List<TipoVehiculos> tiposVehiculos = tipoVehiculoService.getTipoVehiculos();
        model.addAttribute("tipoVehiculos", tiposVehiculos);
        model.addAttribute("vehiculos", vehiculosList);
        return "vehiculos"; // Assuming 'vehiculos' is your Thymeleaf template name
    }

    @PostMapping("/vehiculos/addNew")
    public String addNewVehiculos(Vehiculos vehiculo) {
        vehiculoService.save(vehiculo);
        return "redirect:/vehiculos"; // Redirect to the main vehiculos page
    }
}