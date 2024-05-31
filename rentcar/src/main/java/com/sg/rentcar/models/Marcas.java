package com.sg.rentcar.models;



import java.util.List;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Marcas {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="marcaId")
	private int marcaId;
	
	@Column
	private String descripcion;
	
	@Column
	private boolean activo;
	
	
	@ManyToOne
	@JoinColumn(name="tipoVehiculoId", insertable=false, updatable=false)
	private TipoVehiculos tipoVehiculo;
	private Integer tipoVehiculoId;	
	
	
	@OneToMany
	@JoinColumn(name="modeloId", insertable=false, updatable=false)
	private List<Modelos> modelo;
	
	
}
