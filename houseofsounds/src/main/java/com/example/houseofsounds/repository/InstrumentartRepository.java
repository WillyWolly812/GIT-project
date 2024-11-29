package com.example.houseofsounds.repository;


import com.example.houseofsounds.entity.Abteilung;
import com.example.houseofsounds.entity.Instrumentart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentartRepository extends JpaRepository<Instrumentart, Integer> {

}
