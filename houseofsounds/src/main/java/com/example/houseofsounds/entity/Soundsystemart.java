package com.example.houseofsounds.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Soundsystemart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int soundsystemartID;
    private String art;

    public int getSoundsystemartID() {
        return soundsystemartID;
    }

    public void setSoundsystemartID(int soundsystemartID) {
        this.soundsystemartID = soundsystemartID;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }
}
