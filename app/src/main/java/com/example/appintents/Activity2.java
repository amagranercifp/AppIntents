package com.example.appintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView tvNombre;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvNombre = (TextView)  findViewById(R.id.tvNombre);

        //Recuperamos los datos que vienen del Activity 1
        Intent extra = getIntent();

        if(extra != null){
            nombre = extra.getStringExtra("extra_nombre");
            tvNombre.setText(nombre);
        }
    }
}