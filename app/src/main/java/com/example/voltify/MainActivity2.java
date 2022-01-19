package com.example.voltify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView txtT;
Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i=getIntent(); //Si prende l'intent dell'altra activity per dichiararlo
        txtT=(TextView)findViewById(R.id.txtT);
        txtT.setText(i.getStringExtra("messaggio"));
    }
}