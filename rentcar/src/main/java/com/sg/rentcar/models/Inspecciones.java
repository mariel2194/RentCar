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
	    public int id;

	    @ManyToOne
	    @JoinColumn(name="vehiculoId")
	    public Vehiculos vehiculo;

	    @ManyToOne
	    @JoinColumn(name="clienteId")
	    public Clientes cliente;

	    @Column
	    public boolean defectuoso;

	    @Column
	    public double cantidadCombustible;

	    @Column
	    public boolean gomaRepuesto;

	    @Column
	    public boolean gato;

	    @Column
	    public boolean roturasCristal;

	    @Column
	    public boolean estadoGoma1;

	    @Column
	    public boolean estadoGoma2;

	    @Column
	    public boolean estadoGoma3;

	    @Column
	    public boolean estadoGoma4;

	    @Column
	    public Date fecha;

	    @ManyToOne
	    @JoinColumn(name="empleadoId")
	    public Empleados empleado;	   

	    @Column
	    public boolean estado;
}

