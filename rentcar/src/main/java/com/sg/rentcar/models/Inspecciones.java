package com.sg.rentcar.models;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    @JoinColumn(name = "vehiculoId")
    private Vehiculos vehiculo;

    @ManyToOne
    @JoinColumn(name = "clienteId")
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
    @JoinColumn(name = "empleadoId")
    private Empleados empleado;

    @Column
    private boolean estado;
}
