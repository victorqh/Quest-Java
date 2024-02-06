package com.code.relaciones.Model;

import jakarta.persistence.*;

@Entity
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @ManyToOne
    @JoinColumn(name = "aerolinea_id")

    private Aerolinea aerolinea;

}
