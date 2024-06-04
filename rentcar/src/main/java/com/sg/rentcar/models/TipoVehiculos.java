package com.sg.rentcar.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "tipoVehiculoId")
public class TipoVehiculos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tipoVehiculoId", nullable = false, insertable = false, updatable = false)
	public int tipoVehiculoId;

	@Column(nullable = false)
	public String descripcion;

	@Column(columnDefinition = "BIT", nullable = false)
	public boolean activo;

	@OneToMany
	@JoinColumn(name = "tipoVehiculoId", insertable = false, updatable = false)
	public List<Marcas> marca;

	public Integer marcaId;

}
