package com.example.guiapkmnshuffle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class maraton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maraton);
    }
    public void clickShinyzard(View v){
        Toast.makeText(getApplicationContext(),"Mega Charizard X Shiny (full megaturbos y nivel máximo)",Toast.LENGTH_SHORT).show();
    }
    public void clickNoivern(View v){
        Toast.makeText(getApplicationContext(),"Noivern Eyección a máximo nivel",Toast.LENGTH_SHORT).show();
    }
    public void clickFlygon(View v){
        Toast.makeText(getApplicationContext(),"Flygon Eyección a máximo nivel",Toast.LENGTH_SHORT).show();
    }
    public void clickPokeball(View v){
        Toast.makeText(getApplicationContext(),"Espacio Libre (lo rellena el juego automáticamente)",Toast.LENGTH_SHORT).show();
    }

    public void clickMetagross(View v){
        Toast.makeText(getApplicationContext(),"Metagross Shiny con Ráfaga Frenética al máximo",Toast.LENGTH_SHORT).show();
    }
    public void clickHawlucha(View v){
        Toast.makeText(getApplicationContext(),"Hawlucha Shiny con Ráfaga Frenética al máximo",Toast.LENGTH_SHORT).show();
    }
    public void clickUmbreon(View v){
        Toast.makeText(getApplicationContext(),"Evolución de Eevee con Ráfaga Frenética al máximo",Toast.LENGTH_SHORT).show();
    }
}
