package com.example.encuestaapnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimerSondeoOctavaPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_sondeo_octava_pregunta);
    }

    public void btn_finalizar_primer_sondeo(View view) {
        startActivity(new Intent(getApplicationContext(),SondeoPreguntas.class));
    }
}