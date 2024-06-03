package com.sg.rentcar.models;

import java.util.Date;

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

public class Rentas {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    public int id;

	    @Column
	    public String noRenta;

	    @ManyToOne
	    @JoinColumn(name="empleadoId")
	    public Empleados empleado;

	    @ManyToOne
	    @JoinColumn(name="vehiculoId")
	    public Vehiculos vehiculo;

	    @ManyToOne
	    @JoinColumn(name="clienteId")
	    public Clientes cliente;

	    @Column
	    public Date fechaRenta;

	    @Column
	    public Date fechaDevolucion;

	    @Column
	    public double montoPorDia;

	    @Column
	    public int cantidadDeDias;

	    @Column
	    public String comentarios;

	    @Column
	    public boolean estado;
	

}



