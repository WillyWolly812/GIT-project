package org.example.klassen;

public class Standort {
    private int standortID;
    private String standortName;
    private int plzID;
    private String straße;
    private String hausnummer;

    public Standort(int standortID, String standortName, int plzID, String straße, String hausnummer) {
        this.standortID = standortID;
        this.standortName = standortName;
        this.plzID = plzID;
        this.straße = straße;
        this.hausnummer = hausnummer;
    }

    @Override
    public String toString() {
        return "Standort{" +
                "standortID=" + standortID +
                ", standortName='" + standortName + '\'' +
                ", plzID=" + plzID +
                ", straße='" + straße + '\'' +
                ", hausnummer='" + hausnummer + '\'' +
                '}';
    }

    public int getStandortID() {
        return standortID;
    }

    public void setStandortID(int standortID) {
        this.standortID = standortID;
    }

    public String getStandortName() {
        return standortName;
    }

    public void setStandortName(String standortName) {
        this.standortName = standortName;
    }

    public int getPlzID() {
        return plzID;
    }

    public void setPlzID(int plzID) {
        this.plzID = plzID;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }
}
