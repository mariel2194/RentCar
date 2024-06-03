package com.sg.rentcar.models;



import java.util.List;


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
