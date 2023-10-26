package com.example.appintents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1_Explicito extends AppCompatActivity {

    private EditText etNombre;
    private TextView textView;
    private String nombre;

    Button btnCambioActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.etNombre);
        textView = (TextView) findViewById(R.id.textView);

        btnCambioActivity = (Button) findViewById(R.id.btnCambioActivity);


        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT ){
            textView.setText("Orientación: Portrait");
        }
        else{
            textView.setText("Orientación: Landscape");
        }

        btnCambioActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Activity2.class);
                nombre = etNombre.getText().toString();

                i.putExtra("extra_nombre",nombre);

                startActivity(i);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        nombre = etNombre.getText().toString();
        outState.putString("key_nombre", nombre);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        nombre = savedInstanceState.getString("key_nombre");
        etNombre.setText(nombre);
    }


}