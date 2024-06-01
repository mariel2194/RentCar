package com.sg.rentcar.models;



import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

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
public class Marcas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="marcaId", nullable = false, insertable = false)
    public int marcaId;
    
    @Column
    public String descripcion;
    
    @Column(columnDefinition = "BIT", nullable = false)
    public boolean activo;    
    
    @ManyToOne
    @JoinColumn(name="tipoVehiculoId")
    public TipoVehiculos tipoVehiculo;    
    
    @OneToMany(mappedBy = "marca")
    private List<Modelos> modelos; // Adjusted mappedBy attribute
    
}
