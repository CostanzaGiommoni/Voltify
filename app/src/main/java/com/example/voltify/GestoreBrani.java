package com.example.voltify;

import java.util.ArrayList;
import java.util.Date;

public class GestoreBrani {
    ArrayList<Brani> ListaBrani;
    public GestoreBrani(){
        ListaBrani=new ArrayList<Brani>();
    }
    public void addBrani(String titolo, int durata, String autore, Date datacreazione, String genere){
        Brani b=new Brani(titolo,durata,autore,datacreazione,genere);
        ListaBrani.add(b);
    }
    public String ListaBrani(){
        StringBuilder stBui= new StringBuilder();   //Creare una sola stringa con dentro le informazioni di tutti i brani. Fa concatenare le singole stringhe dei brani.
        for(Brani brV : ListaBrani){
            stBui.append(brV.toString());
        }
        String string=stBui.toString();
        return string;
    }
}
