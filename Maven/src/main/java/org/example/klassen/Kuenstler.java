package org.example.klassen;

public class Kuenstler {
    private int kuenstlerID;
    private String beschreibung;
    private String genre;
    private String kuenstlername;

    public Kuenstler(String kuenstlername, String genre, String beschreibung, int kuenstlerID) {
        this.kuenstlername = kuenstlername;
        this.genre = genre;
        this.beschreibung = beschreibung;
        this.kuenstlerID = kuenstlerID;
    }

    @Override
    public String toString() {
        return "Kuenstler{" +
                "kuenstlerID=" + kuenstlerID +
                ", beschreibung='" + beschreibung + '\'' +
                ", genre='" + genre + '\'' +
                ", kuenstlername='" + kuenstlername + '\'' +
                '}';
    }

    public int getkuenstler_ID() {
        return kuenstlerID;
    }

    public void setkuenstler_ID(int kuenstlerID) {
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

    public String getkuenstlername() {
        return kuenstlername;
    }

    public void setkuenstlername(String kuenstlername) {
        this.kuenstlername = kuenstlername;
    }
}
