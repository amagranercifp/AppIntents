package com.example.appintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityCamara extends AppCompatActivity {

    private Button btnCapturaCamara;
    private ImageView ivCaptura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara);

        btnCapturaCamara = (Button) findViewById(R.id.btnCapturaCamara);

        ivCaptura  = (ImageView) findViewById(R.id.ivCaptura);

        btnCapturaCamara.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                abrirCamara();
            }

        });
    }

    private void abrirCamara(){
        Intent camara = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(camara,1);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == 1 && resultCode == RESULT_OK){
            Bundle extras = data.getExtras();
            Bitmap imgBitmap = (Bitmap) extras.get("data");
            ivCaptura.setImageBitmap(imgBitmap);

        }
    }
}