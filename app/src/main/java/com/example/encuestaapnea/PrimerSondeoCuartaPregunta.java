package com.example.encuestaapnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrimerSondeoCuartaPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_sondeo_cuarta_pregunta);
    }

    public void btn_primer_sondeo_quinta_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),PrimerSondeoQuintaPregunta.class));
    }

}