package com.example.demo.controllers;

import com.example.demo.models.BusModel;
import com.example.demo.services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping
    public List<BusModel> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/{id}")
    public Optional<BusModel> getBusById(@PathVariable Long id) {
        return busService.getBusById(id);
    }

    @PostMapping
    public BusModel createBus(@RequestBody BusModel bus) {
        return busService.saveBus(bus);
    }

}
