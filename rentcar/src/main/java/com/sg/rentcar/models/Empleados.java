package com.sg.rentcar.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")


public class Empleados {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int empleadoId;

	    @Column
	    private String nombre;

	    @Column
	    private String cedula;

	    @Column
	    private String tandaLabor;

	    @Column
	    private double porcientoComision;

	    @Column
	    private Date fechaIngreso;

	    @Column
	    private boolean activo;
	
	
	
	

}
