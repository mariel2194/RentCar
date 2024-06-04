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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "tipoCombustibleId")
public class TipoCombustibles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="tipoCombustibleId")
    private int tipoCombustibleId;

    @Column
    private String descripcion;

    @Column
    private boolean activo;

}
