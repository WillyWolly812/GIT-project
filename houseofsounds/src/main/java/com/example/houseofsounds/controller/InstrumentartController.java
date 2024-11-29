package com.example.houseofsounds.controller;

import com.example.houseofsounds.entity.Instrumentart;
import com.example.houseofsounds.repository.InstrumentartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/instrumentart")
public class InstrumentartController {
    @Autowired
    private InstrumentartRepository InstrumentartRepository;

    // Create
    @PostMapping
    public Instrumentart createInstrumentart(@RequestBody Instrumentart instrumentart) {
        return InstrumentartRepository.save(instrumentart);
    }

    // Read
    @GetMapping
    public List<Instrumentart> getAllInstrumentarten() {
        return InstrumentartRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Instrumentart> getInstrumentartById(@PathVariable int id) {
        return InstrumentartRepository.findById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Instrumentart updateInstrumentart(@PathVariable int id, @RequestBody Instrumentart instrumentartDetails) {
        Instrumentart instrumentart = InstrumentartRepository.findById(id).orElseThrow();
        instrumentart.setArt(instrumentartDetails.getInstrumentartID());
        return InstrumentartRepository.save(instrumentart);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteInstrumentart(@PathVariable int id) {
        InstrumentartRepository.deleteById(id);
    }
}
