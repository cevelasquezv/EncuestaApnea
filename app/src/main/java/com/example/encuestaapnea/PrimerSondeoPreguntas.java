package com.example.encuestaapnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimerSondeoPreguntas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_sondeo_preguntas);
    }

    public void btn_primer_sondeo_segunda_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),PrimerSondeoSegundaPregunta.class));
    }

}