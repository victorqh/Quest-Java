package com.code.relaciones.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "avion")
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aerolinea_id_fk", referencedColumnName = "aerolinea_id")
    private Aerolinea aerolinea;

}