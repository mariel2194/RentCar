package com.sg.rentcar.models;


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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Modelos {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="modeloId" , nullable = false, insertable = false, updatable = false) // 
    @NotNull // Add @NotNull annotation)
	public int modeloId;
	
	@Column
	public String descripcion;
	
	@Column(columnDefinition = "BIT", nullable = false)
	public boolean activo;	
	
	 @ManyToOne
     @JoinColumn(name="marcaId", insertable=false, updatable=false)
     private Marcas marca;
	
	
	
}
