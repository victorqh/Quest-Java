package com.code.relaciones.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Aerolinea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aerolineaId;
    private String nombre;
    private boolean estado;
    private String codigoAerolinea;

    @OneToMany(mappedBy = "aerolinea")

    @JoinColumn(name = "aerolinea_id", referencedColumnName = "id")

    private List<Vuelo> vuelos;



}
