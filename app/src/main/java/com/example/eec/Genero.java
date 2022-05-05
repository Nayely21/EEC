package com.example.eec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class Genero extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genero);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    public void mujer(View view){
        Intent mujer = new Intent(Genero.this,Splashmujer.class);
        startActivity(mujer);
    }
    public void hombre(View view){
        Intent hombre = new Intent(Genero.this,Splashhombre.class);
        startActivity(hombre);
    }


}