package org.example.klassen;

public class Plz {
    private int plzID;
    private String plz;
    private String ort;

    public Plz(int plzID, String plz, String ort) {
        this.plzID = plzID;
        this.plz = plz;
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Plz{" +
                "plzID=" + plzID +
                ", plz=" + plz +
                ", ort='" + ort + '\'' +
                '}';
    }

    public int getPlzID() {
        return plzID;
    }

    public void setPlzID(int plzID) {
        this.plzID = plzID;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
