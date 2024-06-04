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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "modeloId")
public class Modelos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="modeloId", nullable = false, insertable = false, updatable = false)
    private int modeloId;
    
    @Column
    private String descripcion;
    
    @Column(columnDefinition = "BIT", nullable = false)
    private boolean activo;    
    
    @ManyToOne
    @JoinColumn(name="marcaId", insertable=false, updatable=false)
    private Marcas marca;
    
}
