	package com.sg.rentcar.models;

	import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

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
	public class TipoVehiculos {
		
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="tipoVehiculoId" , nullable = false, insertable = false, updatable = false) // 
	    @NotNull // Add @NotNull annotation)
		public int tipoVehiculoId;
		
		@Column(nullable = false)
		public String descripcion;
		
		
		@Column(columnDefinition = "BIT", nullable = false)
		public boolean activo;
		
		
		@OneToMany
		@JoinColumn(name="marcaId", insertable=true, updatable=true)
		private List<Marcas> marca;
		public Integer marcaId;
		
		
	
	}
