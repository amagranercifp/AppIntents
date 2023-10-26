package com.example.appintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuIntentActivity extends AppCompatActivity {

    private Button btnExplicito, btnImplicito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_intent);

        btnExplicito = (Button) findViewById(R.id.btnExplicito);
        btnImplicito = (Button) findViewById(R.id.btnImplicito);


        btnExplicito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Activity1_Explicito.class);

                startActivity(i);
            }
        });

        btnImplicito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), MenuActivityImplicitos.class);

                startActivity(i);
            }
        });
    }
}