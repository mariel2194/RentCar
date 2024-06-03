package com.sg.rentcar.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
