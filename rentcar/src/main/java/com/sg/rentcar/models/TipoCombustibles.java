package com.sg.rentcar.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class TipoCombustibles {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tipoCombustibleId")
	public  int tipoCombustibleId;
	@Column
	public String descripcion;
	@Column
	public boolean activo;	
	
	
	
	
	
}

