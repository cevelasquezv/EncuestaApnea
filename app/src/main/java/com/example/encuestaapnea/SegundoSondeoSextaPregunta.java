package com.example.encuestaapnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundoSondeoSextaPregunta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_sondeo_sexta_pregunta);
    }

    public void btn_segundo_sondeo_septima_pregunta(View view) {
        startActivity(new Intent(getApplicationContext(),SegundoSondeoSeptimaPregunta.class));
    }
}