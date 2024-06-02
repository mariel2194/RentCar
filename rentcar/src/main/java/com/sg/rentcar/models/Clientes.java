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
import jakarta.persistence.OneToMany;
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


