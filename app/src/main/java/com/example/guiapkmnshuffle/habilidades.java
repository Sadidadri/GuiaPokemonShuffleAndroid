package com.example.guiapkmnshuffle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class habilidades extends AppCompatActivity {

    TextView txt_abrasivo;
    TextView txt_abrasivoplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habilidades);

        txt_abrasivo = (TextView)findViewById(R.id.txt_abrasivo);
        txt_abrasivoplus = (TextView)findViewById(R.id.txt_abrasivoplus);
    }

    public void clickAbrasivo(View v){
        Intent intent = new Intent (v.getContext(), abrasivo.class);
        startActivityForResult(intent, 0);
    }

    public void clickAbrasivoPlus(View v){
        Intent intent = new Intent (v.getContext(), abrasivoplus.class);
        startActivityForResult(intent, 0);
    }
}
