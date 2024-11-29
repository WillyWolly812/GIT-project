package com.example.houseofsounds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Rabatt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rabattID;
    private String rabattcode;
    private String hoeheRabatt;
    private String dauer;

    public int getRabattID() {
        return rabattID;
    }

    public void setRabattID(int rabattID) {
        this.rabattID = rabattID;
    }

    public String getRabattcode() {
        return rabattcode;
    }

    public void setRabattcode(String rabattcode) {
        this.rabattcode = rabattcode;
    }

    public String getHoeheRabatt() {
        return hoeheRabatt;
    }

    public void setHoeheRabatt(String hoeheRabatt) {
        this.hoeheRabatt = hoeheRabatt;
    }

    public String getDauer() {
        return dauer;
    }

    public void setDauer(String dauer) {
        this.dauer = dauer;
    }
}
