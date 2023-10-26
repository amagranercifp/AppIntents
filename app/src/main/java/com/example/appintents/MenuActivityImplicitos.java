package com.example.appintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivityImplicitos extends AppCompatActivity {

    private Button btnAbrirWeb, btnLlamada, btnCamara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_implicitos);

        btnAbrirWeb = (Button) findViewById(R.id.btnAbrirWeb);
        btnLlamada = (Button) findViewById(R.id.btnLlamada);
        btnCamara = (Button) findViewById(R.id.btnCamara);


        btnAbrirWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ActivityWeb.class);

                startActivity(i);
            }
        });

        btnLlamada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ActivityLlamada.class);

                startActivity(i);
            }
        });

        btnCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), ActivityCamara.class);

                startActivity(i);
            }
        });
    }

}