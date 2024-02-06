package com.code.relaciones.Service;

import com.code.relaciones.Model.Aerolinea;
import com.code.relaciones.Repository.aerolineaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class aerolineaService {

    @Autowired
    private aerolineaRepository AerolineaRepository;
    public Aerolinea saveAerolinea(Aerolinea aerolinea) {
        return AerolineaRepository.save(aerolinea);
    }

    public Aerolinea getAerolineaById(Long id) {
        return AerolineaRepository.findById(id).orElse(null);
    }
}
