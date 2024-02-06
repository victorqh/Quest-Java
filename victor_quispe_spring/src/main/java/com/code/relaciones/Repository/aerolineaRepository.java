package com.code.relaciones.Repository;


import com.code.relaciones.Model.Aerolinea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface aerolineaRepository extends JpaRepository<Aerolinea, Long> {

}
