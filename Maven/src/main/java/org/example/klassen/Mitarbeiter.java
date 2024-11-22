package org.example.klassen;

public class Mitarbeiter {
    private int mitarbeiterID;
    private String vorname;
    private String nachname;
    private int urlaubstage;
    private float gehalt;
    private int krankheitstage;
    private String geburtsdatum;
    private int wochenstunden;
    private String eintrittsdatum;
    private String straße;
    private String hausnummer;
    private int abteildungID;
    private int plzID;

    public Mitarbeiter(int mitarbeiterID, String vorname, String nachname, int urlaubstage, float gehalt, int krankheitstage, String geburtsdatum, int wochenstunden, String eintrittsdatum, String straße, String hausnummer, int abteildungID, int plzID) {
        this.mitarbeiterID = mitarbeiterID;
        this.vorname = vorname;
        this.nachname = nachname;
        this.urlaubstage = urlaubstage;
        this.gehalt = gehalt;
        this.krankheitstage = krankheitstage;
        this.geburtsdatum = geburtsdatum;
        this.wochenstunden = wochenstunden;
        this.eintrittsdatum = eintrittsdatum;
        this.straße = straße;
        this.hausnummer = hausnummer;
        this.abteildungID = abteildungID;
        this.plzID = plzID;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "mitarbeiterID=" + mitarbeiterID +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", urlaubstage=" + urlaubstage +
                ", gehalt=" + gehalt +
                ", krankheitstage=" + krankheitstage +
                ", geburtsdatum=" + geburtsdatum +
                ", wochenstunden=" + wochenstunden +
                ", eintrittsdatum=" + eintrittsdatum +
                ", straße='" + straße + '\'' +
                ", hausnummer='" + hausnummer + '\'' +
                ", abteildungID=" + abteildungID +
                ", plzID=" + plzID +
                '}';
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(int mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getUrlaubstage() {
        return urlaubstage;
    }

    public void setUrlaubstage(int urlaubstage) {
        this.urlaubstage = urlaubstage;
    }

    public float getGehalt() {
        return gehalt;
    }

    public void setGehalt(float gehalt) {
        this.gehalt = gehalt;
    }

    public int getKrankheitstage() {
        return krankheitstage;
    }

    public void setKrankheitstage(int krankheitstage) {
        this.krankheitstage = krankheitstage;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public int getWochenstunden() {
        return wochenstunden;
    }

    public void setWochenstunden(int wochenstunden) {
        this.wochenstunden = wochenstunden;
    }

    public String getEintrittsdatum() {
        return eintrittsdatum;
    }

    public void setEintrittsdatum(String eintrittsdatum) {
        this.eintrittsdatum = eintrittsdatum;
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

    public int getAbteildunID() {
        return abteildungID;
    }

    public void setAbteildunID(int abteildungID) {
        this.abteildungID = abteildungID;
    }

    public int getPlzID() {
        return plzID;
    }

    public void setPlzID(int plzID) {
        this.plzID = plzID;
    }
}
