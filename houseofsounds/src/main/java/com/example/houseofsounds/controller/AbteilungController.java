package com.example.houseofsounds.controller;

import com.example.houseofsounds.entity.Abteilung;
import com.example.houseofsounds.repository.AbteilungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/abteilung")
public class AbteilungController {
    @Autowired
    private AbteilungRepository abteilungRepository;

    // Create
    @PostMapping
    public Abteilung createAbteilung(@RequestBody Abteilung abteilung) {
        return abteilungRepository.save(abteilung);
    }

    // Read
    @GetMapping
    public List<Abteilung> getAllAbteilungen() {
        return abteilungRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Abteilung> getAbteilungById(@PathVariable int id) {
        return abteilungRepository.findById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Abteilung updateAbteilung(@PathVariable int id, @RequestBody Abteilung abteilungDetails) {
        Abteilung abteilung = abteilungRepository.findById(id).orElseThrow();
        abteilung.setBeschreibung(abteilungDetails.getBeschreibung());
        abteilung.setAufgaben(abteilungDetails.getAufgaben());
        return abteilungRepository.save(abteilung);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteAbteilung(@PathVariable int id) {
        abteilungRepository.deleteById(id);
    }
}
