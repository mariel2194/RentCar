package com.sg.rentcar.models;



import java.util.Date;

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
public class Inspecciones {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @ManyToOne
	    @JoinColumn(name="vehiculoId")
	    private Vehiculos vehiculo;

	    @ManyToOne
	    @JoinColumn(name="clienteId")
	    private Clientes cliente;

	    @Column
	    private boolean defectuoso;

	    @Column
	    private double cantidadCombustible;

	    @Column
	    private boolean gomaRepuesto;

	    @Column
	    private boolean gato;

	    @Column
	    private boolean roturasCristal;

	    @Column
	    private boolean estadoGoma1;

	    @Column
	    private boolean estadoGoma2;

	    @Column
	    private boolean estadoGoma3;

	    @Column
	    private boolean estadoGoma4;

	    @Column
	    private Date fecha;

	    @ManyToOne
	    @JoinColumn(name="empleadoId")
	    private Empleados empleado;	   

	    @Column
	    private boolean estado;
}

