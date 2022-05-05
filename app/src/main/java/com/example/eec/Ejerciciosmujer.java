package com.example.eec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Ejerciciosmujer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejerciciosmujer);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ejerciciosmujer);

    }

    public void abdominalmu(View view){
        Intent abdominalmu = new Intent(this, Mujerabdominales.class);
        startActivity(abdominalmu);
    }

    public void planchamu(View view){
        Intent planchamu = new Intent(this, Mujerplancha.class);
        startActivity(planchamu);
    }

    public void sentadillamu(View view){
        Intent sentadillamu = new Intent(this,Mujersentadilla.class);
        startActivity(sentadillamu);
    }

    public void piernasmu(View view){
        Intent piernasmu = new Intent(this,Mujerpiernas.class);
        startActivity(piernasmu);
    }

    public void brazosmu(View view){
        Intent brazosmu = new Intent(this,Mujerbrazos.class);
        startActivity(brazosmu);
    }
}