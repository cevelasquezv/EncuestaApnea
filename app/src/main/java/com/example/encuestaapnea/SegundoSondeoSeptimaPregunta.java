package com.example.encuestaapnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoSondeoSeptimaPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_sondeo_septima_pregunta);
    }

    public void btn_segundo_sondeo_octava_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),SegundoSondeoOctavaPregunta.class));
    }
}