package com.example.houseofsounds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Instrumentart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int instrumentartID;
    private String art;

    public int getInstrumentartID() {
        return instrumentartID;
    }

    public void setInstrumentartID(int instrumentartID) {
        this.instrumentartID = instrumentartID;
    }

    public String getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = String.valueOf(art);
    }
}
