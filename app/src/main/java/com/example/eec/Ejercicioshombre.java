package com.example.eec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Ejercicioshombre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicioshombre);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ejercicioshombre);
    }

    public void abdominalho(View view){
        Intent abdominalho = new Intent(this, Hombreabdominal.class);
        startActivity(abdominalho);
    }

    public void planchaho(View view){
        Intent planchaho = new Intent(this,Hombreplancha.class);
        startActivity(planchaho);
    }

    public void sentadillaho(View view){
        Intent sentadillaho = new Intent(this,Hombresentadilla.class);
        startActivity(sentadillaho);
    }

    public void piernasho(View view){
        Intent piernasho = new Intent(this,Hombrepiernas.class);
        startActivity(piernasho);
    }

    public void brazosho(View view){
        Intent brazosho = new Intent(this,Hombrebrazos.class);
        startActivity(brazosho);
    }
}