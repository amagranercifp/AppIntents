package com.example.appintents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLlamada extends AppCompatActivity {

    EditText editTextPhone;

    Button buttonLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamada);

        editTextPhone = (EditText)  findViewById(R.id.editTextPhone);
        buttonLlamar = (Button)  findViewById(R.id.buttonLlamar);

        buttonLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);

                i.setData(Uri.parse("tel:"+editTextPhone.getText().toString()));

                startActivity(i);
            }
        });
    }

}