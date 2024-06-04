package com.sg.rentcar.models;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "clienteId")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int clienteId;

    @Column
    private String nombre;

    @Column
    private String cedula;

    @Column
    private String noTarjeta;

    @Column
    private double limiteCredito;

    @Column
    private String tipoPersona;

    @Column
    private boolean activo;

}
