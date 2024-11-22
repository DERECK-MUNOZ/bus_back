package com.example.demo.services;

import com.example.demo.models.BusModel;
import com.example.demo.repositories.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

 
    public List<BusModel> getAllBuses() {
        return busRepository.findAll();
    }


    public Optional<BusModel> getBusById(Long id) {
        return busRepository.findById(id);
    }


    public BusModel saveBus(BusModel bus) {
        return busRepository.save(bus);
    }

}
