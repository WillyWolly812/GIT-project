package com.example.houseofsounds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Zahlungsart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int zahlungsartID;
    private String zahlungsmethode;

    public int getZahlungsartID() {
        return zahlungsartID;
    }

    public void setZahlungsartID(int zahlungsartID) {
        this.zahlungsartID = zahlungsartID;
    }

    public String getZahlungsmethode() {
        return zahlungsmethode;
    }

    public void setZahlungsmethode(String zahlungsmethode) {
        this.zahlungsmethode = zahlungsmethode;
    }
}
