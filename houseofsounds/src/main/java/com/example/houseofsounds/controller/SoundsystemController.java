package com.example.houseofsounds.controller;

import com.example.houseofsounds.entity.Soundsystemart;
import com.example.houseofsounds.repository.SoundsystemartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/soundsystemart")
public class SoundsystemController {
    @Autowired
    private SoundsystemartRepository SoundsystemartRepository;

    // Create
    @PostMapping
    public Soundsystemart createSoundsystemart(@RequestBody Soundsystemart soundsystemart) {
        return SoundsystemartRepository.save(soundsystemart);
    }

    // Read
    @GetMapping
    public List<Soundsystemart> getAllSoundsystemarten() {
        return SoundsystemartRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Soundsystemart> getSoundsystemartById(@PathVariable int id) {
        return SoundsystemartRepository.findById(id);
    }

    // Update
    @PutMapping("/{id}")
    public Soundsystemart updateSoundsystemart(@PathVariable int id, @RequestBody Soundsystemart soundsystemartDetails) {
        Soundsystemart soundsystemart = SoundsystemartRepository.findById(id).orElseThrow();
        soundsystemart.setSoundsystemartID(soundsystemartDetails.getSoundsystemartID());
        soundsystemart.setArt(soundsystemartDetails.getArt());
        return SoundsystemartRepository.save(soundsystemart);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteSoundsystemart(@PathVariable int id) {
        SoundsystemartRepository.deleteById(id);
    }
}
