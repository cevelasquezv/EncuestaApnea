package com.example.encuestaapnea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_sondeo_preguntas(View view) {
        startActivity(new Intent(getApplicationContext(),SondeoPreguntas.class));
    }
}