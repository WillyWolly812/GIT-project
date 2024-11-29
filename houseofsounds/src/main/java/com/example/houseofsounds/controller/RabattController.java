package com.example.houseofsounds.controller;

import com.example.houseofsounds.entity.Rabatt;
import com.example.houseofsounds.repository.RabattRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rabatt")
public class RabattController {
    @Autowired
    private RabattRepository RabattRepository;

    // Create
    @PostMapping
    public Rabatt createRabatt(@RequestBody Rabatt rabatt) {
        return RabattRepository.save(rabatt);
    }

    // Read
    @GetMapping
    public List<Rabatt> getAllRabatten() {
        return RabattRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Rabatt> getRabattById(@PathVariable int id) {
        return RabattRepository.findById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Rabatt updateRabatt(@PathVariable int id, @RequestBody Rabatt rabattDetails) {
        Rabatt rabatt = RabattRepository.findById(id).orElseThrow();
        rabatt.setRabattID(rabattDetails.getRabattID());
        rabatt.setRabattcode(rabattDetails.getRabattcode());
        rabatt.setHoeheRabatt(rabattDetails.getHoeheRabatt());
        rabatt.setDauer(rabattDetails.getDauer());
        return RabattRepository.save(rabatt);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteRabatt(@PathVariable int id) {
        RabattRepository.deleteById(id);
    }
}
