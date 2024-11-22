package com.example.demo.controllers;

import com.example.demo.models.MarcaModel;
import com.example.demo.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marca")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public List<MarcaModel> obtenerTodasLasMarcas() {
        return marcaService.obtenerTodasLasMarcas();
    }

    @GetMapping("/{id}")
    public Optional<MarcaModel> obtenerMarcaPorId(@PathVariable Long id) {
        return marcaService.obtenerMarcaPorId(id);
    }

    @PostMapping
    public MarcaModel crearMarca(@RequestBody MarcaModel marca) {
        return marcaService.guardarMarca(marca);
    }

}
