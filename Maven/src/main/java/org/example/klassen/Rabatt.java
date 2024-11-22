package org.example.klassen;

public class Rabatt {
    private int rabatt_ID;
    private String rabattCode;
    private float hoeheRabatt;
    private int dauer;

    public Rabatt(int rabatt_ID, String rabattCode, float hoeheRabatt, int dauer) {
        this.rabatt_ID = rabatt_ID;
        this.rabattCode = rabattCode;
        this.hoeheRabatt = hoeheRabatt;
        this.dauer = dauer;
    }

    @Override
    public String toString() {
        return "Rabatt{" +
                "rabatt_ID=" + rabatt_ID +
                ", rabattCode='" + rabattCode + '\'' +
                ", hoeheRabatt=" + hoeheRabatt +
                ", dauer=" + dauer +
                '}';
    }

    public int getRabatt_ID() {
        return rabatt_ID;
    }

    public void setRabatt_ID(int rabatt_ID) {
        this.rabatt_ID = rabatt_ID;
    }

    public String getRabattCode() {
        return rabattCode;
    }

    public void setRabattCode(String rabattCode) {
        this.rabattCode = rabattCode;
    }

    public float getHoeheRabatt() {
        return hoeheRabatt;
    }

    public void setHoeheRabatt(float hoeheRabatt) {
        this.hoeheRabatt = hoeheRabatt;
    }

    public int getDauer() {
        return dauer;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }
}
