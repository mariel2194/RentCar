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

public class Rentas {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column
	    private String noRenta;

	    @ManyToOne
	    @JoinColumn(name="empleadoId")
	    private Empleados empleado;

	    @ManyToOne
	    @JoinColumn(name="vehiculoId")
	    private Vehiculos vehiculo;

	    @ManyToOne
	    @JoinColumn(name="clienteId")
	    private Clientes cliente;

	    @Column
	    private Date fechaRenta;

	    @Column
	    private Date fechaDevolucion;

	    @Column
	    private double montoPorDia;

	    @Column
	    private int cantidadDeDias;

	    @Column
	    private String comentarios;

	    @Column
	    private boolean estado;
	

}



