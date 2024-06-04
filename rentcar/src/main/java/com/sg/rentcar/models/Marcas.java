package com.sg.rentcar.models;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "marcaId")
public class Marcas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="marcaId", nullable = false, insertable = false)
    private int marcaId;
    
    @Column
    private String descripcion;
    
    @Column(columnDefinition = "BIT", nullable = false)
    private boolean activo;    
    
    @ManyToOne
    @JoinColumn(name="tipoVehiculoId")
    private TipoVehiculos tipoVehiculo;    
    
    @OneToMany(mappedBy = "marca")
    private List<Modelos> modelos; // Adjusted mappedBy attribute
    
}
