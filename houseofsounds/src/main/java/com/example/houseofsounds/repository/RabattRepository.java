package com.example.houseofsounds.repository;


import com.example.houseofsounds.entity.Kuenstler;
import com.example.houseofsounds.entity.Rabatt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RabattRepository extends JpaRepository<Rabatt, Integer> {

}
