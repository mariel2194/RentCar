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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "vehiculoId")
public class Vehiculos {

	


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int vehiculoId;

    @Column(length = 20)
    public String descripcion;

    @Column(length = 20)
    public String noChasis;

    @Column(length = 20)
    public String noMotor;

    @Column(length = 20)
    public String placa;

    @ManyToOne
    @JoinColumn(name = "tipoVehiculoId", referencedColumnName = "tipoVehiculoId")
    public TipoVehiculos tipoVehiculo;
}
