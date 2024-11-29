package com.example.houseofsounds.controller;

import com.example.houseofsounds.entity.Kuenstler;
import com.example.houseofsounds.repository.KuenstlerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/künstler")
public class KuenstlerController {
    @Autowired
    private KuenstlerRepository KuenstlerRepository;

    // Create
    @PostMapping
    public Kuenstler createKuenstler(@RequestBody Kuenstler kuenstler) {
        return KuenstlerRepository.save(kuenstler);
    }

    // Read
    @GetMapping
    public List<Kuenstler> getAllKuenstleren() {
        return KuenstlerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Kuenstler> getKuenstlerById(@PathVariable int id) {
        return KuenstlerRepository.findById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Kuenstler updateKuenstler(@PathVariable int id, @RequestBody Kuenstler kuenstlerDetails) {
        Kuenstler kuenstler = KuenstlerRepository.findById(id).orElseThrow();
        kuenstler.setKuenstlerID(kuenstlerDetails.getKuenstlerID());
        kuenstler.setBeschreibung(kuenstlerDetails.getBeschreibung());
        kuenstler.setGenre(kuenstlerDetails.getGenre());
        kuenstler.setKuenstlerName(kuenstlerDetails.getKuenstlerName());
        return KuenstlerRepository.save(kuenstler);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteKuenstler(@PathVariable int id) {
        KuenstlerRepository.deleteById(id);
    }
}
