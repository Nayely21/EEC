package com.example.eec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splashhombre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //toda la pantalla
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashhombre);

        //Animacion
        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        TextView txtuncorrectoejercicio = findViewById(R.id.txtuncorrectoejercicio);
        TextView txtunamejorvida = findViewById(R.id.txtunamejorvida);
        ImageView ivlogo = findViewById(R.id.ivlogo);

        txtuncorrectoejercicio.setAnimation(animacion2);
        txtunamejorvida.setAnimation(animacion2);
        ivlogo.setAnimation(animacion1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent inten = new Intent(Splashhombre.this,Ejercicioshombre.class);
                startActivity(inten);
                finish();
            }
        },4000);


    }
}