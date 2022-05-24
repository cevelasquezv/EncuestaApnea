package com.example.encuestaapnea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RegistroInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_inicial);
        getSupportActionBar().setTitle("Registro Inicial");
    }

}