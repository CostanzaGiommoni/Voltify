package com.example.voltify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnInserisci;
Button btn2Inserisci;
EditText txtTitolo;
EditText txt2Titolo;
GestoreBrani gb;
String titolo;
int durata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInserisci=(Button)findViewById(R.id.btnInserisci);
        btn2Inserisci=(Button)findViewById(R.id.btn2Inserisci);
        gb=new GestoreBrani();
        txtTitolo=(EditText)findViewById(R.id.txtTitolo);
        txt2Titolo=(EditText)findViewById(R.id.txt2Titolo);
        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gb.addBrani(txtTitolo.getText().toString());
            }

        });
        btn2Inserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

}