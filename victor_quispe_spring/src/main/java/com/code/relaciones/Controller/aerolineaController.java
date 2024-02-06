package com.code.relaciones.Controller;


import com.code.relaciones.Model.Aerolinea;
import com.code.relaciones.Service.aerolineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/aerolinea")
public class aerolineaController {

    @Autowired
    private aerolineaService AerolineaService;

    @PostMapping("/save")
    public ResponseEntity<Aerolinea> saveAerolinea(@RequestBody Aerolinea aerolinea) {
        Aerolinea savedAerolinea = AerolineaService.saveAerolinea(aerolinea);
        return ResponseEntity.ok(savedAerolinea);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Aerolinea> getAerolineaById(@PathVariable Long id) {
        Aerolinea aerolinea = AerolineaService.getAerolineaById(id);

        if (aerolinea == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(aerolinea);
    }
}
