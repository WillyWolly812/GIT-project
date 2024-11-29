package com.example.houseofsounds.repository;


import com.example.houseofsounds.entity.Instrumentart;
import com.example.houseofsounds.entity.Kuenstler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KuenstlerRepository extends JpaRepository<Kuenstler, Integer> {

}
