	package com.sg.rentcar.models;

	import java.util.List;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
	import com.fasterxml.jackson.annotation.ObjectIdGenerators;
	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.OneToMany;
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
