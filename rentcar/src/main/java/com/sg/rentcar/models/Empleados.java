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
	    public int empleadoId;

	    @Column
	    public String nombre;

	    @Column
	    public String cedula;

	    @Column
	    public String tandaLabor;

	    @Column
	    public double porcientoComision;

	    @Column
	    public Date fechaIngreso;

	    @Column
	    public boolean activo;
	
	
	
	

}
