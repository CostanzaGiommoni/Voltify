package com.example.voltify;

import java.util.Date;

public class Brani {
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    private String titolo;

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    private int durata;

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    private String autore;

    public Date getDatacreazione() {
        return datacreazione;
    }

    public void setDatacreazione(Date datacreazione) {
        this.datacreazione = datacreazione;
    }

    private Date datacreazione;

    public Brani(String titolo){
        this.titolo=titolo;
    }
}
