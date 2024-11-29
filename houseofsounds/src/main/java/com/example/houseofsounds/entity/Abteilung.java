package com.example.houseofsounds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Abteilung {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int abteilungID;
    private String beschreibung;
    private String aufgaben;

    public int getAbteilungID() {
        return abteilungID;
    }

    public void setAbteilungID(int abteilungID) {
        this.abteilungID = abteilungID;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getAufgaben() {
        return aufgaben;
    }

    public void setAufgaben(String aufgaben) {
        this.aufgaben = aufgaben;
    }
}
