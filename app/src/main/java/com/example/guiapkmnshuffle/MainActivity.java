package com.example.guiapkmnshuffle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button fasesespeciales;
    Button megaturbo;
    Button cambiacapacidad;
    Button fmeowth;
    Button telegram;
    Button info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fasesespeciales = findViewById(R.id.btnfasesespeciales);
        megaturbo = findViewById(R.id.btn_megaturbo);
        cambiacapacidad = findViewById(R.id.btn_cambiacapacidad);
        fmeowth = findViewById(R.id.btn_gato);
        telegram = findViewById(R.id.btn_telegram);
        info = findViewById(R.id.btn_info);
    }
    public void clickFasesEspeciales(View v){
        Intent intent = new Intent (v.getContext(), fespeciales.class);
        startActivityForResult(intent, 0);
    }

    public void clickMegaturbo(View v){
        //Intent intent = new Intent (v.getContext(), megaturbos.class);
        //startActivityForResult(intent, 0);
    }
    public void clickMaraton(View v){
        Intent intent = new Intent (v.getContext(), maraton.class);
        startActivityForResult(intent, 0);
    }
    public void clickFMeowth(View v){
        Intent intent = new Intent (v.getContext(), fmeowth.class);
        startActivityForResult(intent, 0);
    }
    public void clickTelegram(View v){
        Uri uri = Uri.parse("https://t.me/shufflepokemon");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void clickInfo(View v){
        Intent intent = new Intent (v.getContext(), infoapp.class);
        startActivityForResult(intent, 0);
    }
}
