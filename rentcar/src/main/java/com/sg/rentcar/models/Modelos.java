package com.sg.rentcar.models;



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
public class Modelos {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="modeloId" , nullable = false, insertable = false, updatable = false) // 
	public int modeloId;
	
	@Column
	public String descripcion;
	
	@Column(columnDefinition = "BIT", nullable = false)
	public boolean activo;	
	
	 @ManyToOne
     @JoinColumn(name="marcaId", insertable=false, updatable=false)
     private Marcas marca;
	
	
	
}
