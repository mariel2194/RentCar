package com.sg.rentcar.models;

import java.util.Date;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Vehiculos {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id" , nullable = false, insertable = false, updatable = false) // 
    @NotNull // Add @NotNull annotation)
	public int vehiculoId;
	
	@Column(length=20)
	public String descripcion;
	
	@Column(length=20)
	public String noChasis;
	
	@Column(length=20)
	public String noMotor;
	
	@Column(length=20)
	public String placa;	
	
	
	@ManyToOne
	@JoinColumn(name="tipoVehiculoId", insertable=false, updatable=false)
	private TipoVehiculos tipoVehiculo;
	public Integer tipoVehiculoId;	
	
	
}
