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
    public StringBuilder ListaBrani(){
        StringBuilder stBui= new StringBuilder(1200);   //Creare una sola stringa con dentro le informazioni di tutti i brani. Fa concatenare le singole stringhe dei brani.
        for(Brani brV : ListaBrani){
            stBui.append(brV.toString());           //For-elemento di tipo brano, va a leggere la lista.Oppure stBui.append(stBui.getTitolo().toString()+"-")  stBui.append(stBui.getAutore()+"\n"),
        }
        return stBui;
    }
}
