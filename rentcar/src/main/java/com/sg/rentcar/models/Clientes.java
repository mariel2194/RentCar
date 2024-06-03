package com.sg.rentcar.models;
import java.util.Date;

import javax.persistence.Entity;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.Column;
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
public class Clientes {
	
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    public int clienteId;

	    @Column
	    public String nombre;

	    @Column
	    public String cedula;

	    @Column
	    public String noTarjeta;

	    @Column
	    public double limiteCredito;

	    @Column
	    public String tipoPersona;

	    @Column
	    public boolean activo;
	
}


