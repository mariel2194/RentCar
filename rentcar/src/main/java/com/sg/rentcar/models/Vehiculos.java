package com.sg.rentcar.models;

import java.util.Date;
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
	@Column(name="id")
	private int vehiculoId;
	
	@Column(length=20)
	private String desripcion;
	
	@Column(length=20)
	private String noChasis;
	
	@Column(length=20)
	private String noMotor;
	
	@Column(length=20)
	private String placa;	
	
	
	@ManyToOne
	@JoinColumn(name="tipoVehiculoId", insertable=false, updatable=false)
	private TipoVehiculos tipoVehiculo;
	private Integer tipoVehiculoId;	
	
	
}
