package com.example.voltify;

import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brani> ListaBrani;
    public GestoreBrani(){
        ListaBrani=new ArrayList<Brani>();
    }
    public void addBrani(String titolo, int durata){
        Brani b=new Brani(titolo,durata);
        ListaBrani.add(b);
    }
    public void ListaBrani(){
        StringBuilder stBui= new StringBuilder();
        for(Brani brV : ListaBrani){
            stBui.append(brV.toString());
        }
    }
}
