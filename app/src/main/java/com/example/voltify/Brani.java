package com.example.voltify;

import java.util.Date;

public class Brani {
    private String titolo;
    private int durata;
    private String autore;
    private Date datacreazione;
    private String genere;

    public Brani(String titolo,int durata,String autore,Date datacreazione,String genere){
        this.titolo=titolo;
        this.durata=durata;
        this.autore=autore;
        this.datacreazione=datacreazione;
        this.genere=genere;

    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }
    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getAutore() {
        return autore;
    }
    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Date getDatacreazione() {
        return datacreazione;
    }
    public void setDatacreazione(Date datacreazione) {
        this.datacreazione = datacreazione;
    }

    public String getGenere() { return genere; }
    public void setGenere(String genere) { this.genere = genere; }

    @Override
    public String toString() {      //Stringa per ogni brano
        return "Brani{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                ", autore='" + autore + '\'' +
                ", datacreazione=" + datacreazione +
                ", genere='" + genere + '\'' +
                '}';
    }
}
