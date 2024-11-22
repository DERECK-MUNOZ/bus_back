package com.example.demo.services;

import com.example.demo.models.MarcaModel;
import com.example.demo.repositories.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    
    @Autowired
    private MarcaRepository marcaRepository;

   
    public List<MarcaModel> obtenerTodasLasMarcas() {
        return marcaRepository.findAll();
    }

    
    public Optional<MarcaModel> obtenerMarcaPorId(Long id) {
        return marcaRepository.findById(id);
    }

    
    public MarcaModel guardarMarca(MarcaModel marca) {
        return marcaRepository.save(marca);
    }


}
