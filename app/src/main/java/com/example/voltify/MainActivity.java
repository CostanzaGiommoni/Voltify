package com.example.voltify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {   //AppCompactActivity è una classe madre che viene estesa
Button btnInserisci;            //Inserisci
Button btn2Inserisci;           //Invia
EditText txtTitolo;             //Titolo
EditText txt2Titolo;            //Durata
GestoreBrani gb;                //Classe Gestore Brani
TextView txtview;
EditText txt3Titolo;
EditText txt4Titolo;
Spinner spinner;
    private Object DateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Crea la view sull'xml
        btnInserisci=(Button)findViewById(R.id.btnInserisci); // findviewbyId Collegano l'elemento grafico a java
        btn2Inserisci=(Button)findViewById(R.id.btn2Inserisci);
        gb=new GestoreBrani();
        txtTitolo=(EditText)findViewById(R.id.txtTitolo);
        txt2Titolo=(EditText)findViewById(R.id.txt2Titolo);
        txt3Titolo=(EditText)findViewById(R.id.txt3Titolo);
        txt4Titolo=(EditText)findViewById((R.id.txt4Titolo);
        TextView txtview=(TextView)findViewById(R.id.txtView);
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        /*Convertire una stringa in una data, stabiliamo un formato di data*/
        DateFormat format=new SimpleDateFormat("MMMM d,yyyy",Locale.ENGLISH);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, //Addatta gli array
                R.array.genere, android.R.layout.simple_spinner_item); //Prende l'array genere e layout come adattarlo allo spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //Come vedere la lista sullo spinner
        spinner.setAdapter(adapter);
        btnInserisci.setOnClickListener(new View.OnClickListener() {        //Listener=ascoltatore Onclicl=Quando cliccli fa ciò che è all'interno
            @Override
            public void onClick(View view) {        //Metterle i dati dell'interfaccia in un brano
                Date data=null;
                try{
                    data=format.parse(txt4Titolo.getText().toString());
                }catch (ParseException e){
                    e.printStackTrace();
                }
                gb.addBrani(txtTitolo.getText().toString(),Integer.parseInt(txt2Titolo.getText().toString()),txt3Titolo.getText().toString(),data,spinner.getSelectedItem().toString()); //1 prendi edittext trasforma in stringa e lo inserisce nella variabile nel metodo in gestorebrani //2 fa lo stesso ma una volta che convertito in stringa lo trasfroma da stringa ad int
            }

        });
        btn2Inserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity2.class); //SecondaActivity
                i.putExtra("Messaggio",gb.ListaBrani());
                startActivity(i);
            }
        });
    }

}