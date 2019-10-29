package com.example.guiapkmnshuffle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class fmeowth extends AppCompatActivity {

    Button  btn_mewtwoY;
    Button  btn_meloetta;
    Button  btn_cosmog;
    Button  btn_unown;
    Button btn_salamence;
    Button btn_lugia;
    Button btn_swablu;
    Button btn_pokeball;
    Button btn_rayquaza;
    Button btn_sunkern;
    Button btn_manaphy;
    Button btn_pokeball2;
    Button btn_gengar;
    Button btn_sunkern2;
    Button btn_manaphy2;
    Button btn_pokeball3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fmeowth);

        btn_mewtwoY = findViewById(R.id.mewtwoY);
        btn_unown = findViewById(R.id.btn_miembro1);
        btn_meloetta = findViewById(R.id.btn_miembro2);
        btn_cosmog = findViewById(R.id.btn_miembro3);

        btn_salamence = findViewById(R.id.salamence);
        btn_lugia = findViewById(R.id.btn_miembro4);
        btn_swablu = findViewById(R.id.btn_miembro5);
        btn_pokeball = findViewById(R.id.btn_miembro6);

        btn_rayquaza = findViewById(R.id.megarayquaza);
        btn_sunkern = findViewById(R.id.btn_miembro7);
        btn_manaphy = findViewById(R.id.btn_miembro8);
        btn_pokeball2 = findViewById(R.id.btn_miembro9);

        btn_gengar = findViewById(R.id.megagengar);
        btn_sunkern2 = findViewById(R.id.btn_miembro10);
        btn_manaphy2 = findViewById(R.id.btn_miembro11);
        btn_pokeball3 = findViewById(R.id.btn_miembro12);
    }

    public void clickMewtwoY(View v){
        Toast.makeText(getApplicationContext(),"Mega Mewtwo Y  (Full Megaturbos)",Toast.LENGTH_SHORT).show();
    }
    public void clickUnown(View v){
        Toast.makeText(getApplicationContext(),"1 pokemon con Megafuerza+",Toast.LENGTH_SHORT).show();
    }
    public void clickMeloetta(View v){
        Toast.makeText(getApplicationContext(),"2 pokemon psíquico con Antojo++",Toast.LENGTH_SHORT).show();
    }
    public void clickSalamence(View v){
        Toast.makeText(getApplicationContext(),"Mega Salamence (full megaturbos y megafuerza)",Toast.LENGTH_SHORT).show();
    }
    public void clickLugia(View v){
        Toast.makeText(getApplicationContext(),"Lugia (Expulsión +)",Toast.LENGTH_SHORT).show();
    }
    public void clickSwablu(View v){
        Toast.makeText(getApplicationContext(),"Swablu (Megafuerza+)",Toast.LENGTH_SHORT).show();
    }
    public void clickPokeball(View v){
        Toast.makeText(getApplicationContext(),"Espacio Libre (El juego rellena automaticamente)",Toast.LENGTH_SHORT).show();
    }
    public void clickMegaRayquaza(View v){
        Toast.makeText(getApplicationContext(),"Mega Rayquaza (full megaturbos)",Toast.LENGTH_SHORT).show();
    }
    public void clickSunkern(View v){
        Toast.makeText(getApplicationContext(),"2 pokémons (tipo distinto a dragón) con expulsión++",Toast.LENGTH_SHORT).show();
    }
    public void clickMegaGengar(View v){
        Toast.makeText(getApplicationContext(),"Mega Gengar",Toast.LENGTH_SHORT).show();
    }
    public void clickManaphy(View v){
        Toast.makeText(getApplicationContext(),"2 pokémons con expulsión++",Toast.LENGTH_SHORT).show();
    }
}
