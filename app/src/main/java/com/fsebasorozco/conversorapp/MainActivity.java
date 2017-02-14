package com.fsebasorozco.conversorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main); // Relaciona el archivo xml
        TextView texto = new TextView(this); // si con alt+enter no agrrega libraeria hay que agregarla por gradle
        texto.setText("Prueba de programacion en java");
        setContentView(texto);
    }
}
