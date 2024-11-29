package com.example.houseofsounds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Kuenstler {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int kuenstlerID;
    private String beschreibung;
    private String genre;
    private String kuenstlerName;

    public int getKuenstlerID() {
        return kuenstlerID;
    }

    public void setKuenstlerID(int kuenstlerID) {
        this.kuenstlerID = kuenstlerID;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getKuenstlerName() {
        return kuenstlerName;
    }

    public void setKuenstlerName(String kuenstlerName) {
        this.kuenstlerName = kuenstlerName;
    }
}
