package com.example.houseofsounds.controller;

import com.example.houseofsounds.entity.Zahlungsart;
import com.example.houseofsounds.repository.ZahlungsartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/zahlungsart")
public class ZahlungsartController {
    @Autowired
    private ZahlungsartRepository ZahlungsartRepository;

    // Create
    @PostMapping
    public Zahlungsart createZahlungsart(@RequestBody Zahlungsart zahlungsart) {
        return ZahlungsartRepository.save(zahlungsart);
    }

    // Read
    @GetMapping
    public List<Zahlungsart> getAllZahlungsarten() {
        return ZahlungsartRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Zahlungsart> getZahlungsartById(@PathVariable int id) {
        return ZahlungsartRepository.findById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Zahlungsart updateZahlungsart(@PathVariable int id, @RequestBody Zahlungsart zahlungsartDetails) {
        Zahlungsart zahlungsart = ZahlungsartRepository.findById(id).orElseThrow();
        zahlungsart.setZahlungsartID(zahlungsartDetails.getZahlungsartID());
        zahlungsart.setZahlungsmethode(zahlungsartDetails.getZahlungsmethode());
        return ZahlungsartRepository.save(zahlungsart);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteZahlungsart(@PathVariable int id) {
        ZahlungsartRepository.deleteById(id);
    }
}
