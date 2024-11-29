package com.example.houseofsounds.repository;


import com.example.houseofsounds.entity.Soundsystemart;
import com.example.houseofsounds.entity.Zahlungsart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZahlungsartRepository extends JpaRepository<Zahlungsart, Integer> {

}
