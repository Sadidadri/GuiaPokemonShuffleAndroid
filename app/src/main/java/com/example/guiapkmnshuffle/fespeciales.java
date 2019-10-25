package com.example.guiapkmnshuffle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;



public class fespeciales extends AppCompatActivity {
    Spinner spinnerSemana;
    int semanaActual;

    {
        try {
            semanaActual = calcularDiasDiferencia()/7+1;
        } catch (ParseException e) {
            Log.e("error","no se pudo parsear la fecha");
        }
    }

    TextView textoDiaActual;
    //Inicializar las 25 imagenes
    ImageView imgu;
    ImageView imgoe1;
    ImageView imgoe2;
    ImageView imgoe3;
    ImageView imgoe4;
    ImageView imgoe5;
    ImageView imgfg;
    ImageView imgsf1;
    ImageView imgsf2;
    ImageView imgsf3;
    ImageView imgsf4;
    ImageView imgsf5;
    ImageView imgsf6;
    ImageView imgsf7;
    ImageView imgsf8;
    ImageView imgsf9;
    ImageView imgsf10;
    ImageView imgod;
    ImageView imge;
    ImageView imgc;
    ImageView imgpd1;
    ImageView imgpd2;
    ImageView imgpd3;
    ImageView imgpd4;
    ImageView imgpd5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fespeciales);

        //Inicializar imagenes;
        imgu = findViewById(R.id.imgU1);
        imgoe1 = findViewById(R.id.imgOE1);
        imgoe2 = findViewById(R.id.imgOE2);
        imgoe3 = findViewById(R.id.imgOE3);
        imgoe4 = findViewById(R.id.imgOE4);
        imgoe5 = findViewById(R.id.imgOE5);
        imgfg = findViewById(R.id.imgFG1);
        imgsf1 = findViewById(R.id.imgSF1);
        imgsf2 = findViewById(R.id.imgSF2);
        imgsf3 = findViewById(R.id.imgSF3);
        imgsf4 = findViewById(R.id.imgSF4);
        imgsf5 = findViewById(R.id.imgSF5);
        imgsf6 = findViewById(R.id.imgSF6);
        imgsf7 = findViewById(R.id.imgSF7);
        imgsf8 = findViewById(R.id.imgSF8);
        imgsf9 = findViewById(R.id.imgSF9);
        imgsf10 = findViewById(R.id.imgSF10);
        imgod = findViewById(R.id.imgOD1);
        imge = findViewById(R.id.imgE1);
        imgc = findViewById(R.id.imgC1);
        imgpd1 = findViewById(R.id.imgPD1);
        imgpd2 = findViewById(R.id.imgPD2);
        imgpd3 = findViewById(R.id.imgPD3);
        imgpd4 = findViewById(R.id.imgPD4);
        imgpd5 = findViewById(R.id.imgPD5);

        //Texto de fecha actual
        textoDiaActual = (TextView)findViewById(R.id.txtdia);
        colocarDiaActual();
        //Spinner creado
        spinnerSemana = findViewById(R.id.semanaspinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.semanas,android.R.layout.simple_spinner_item);
        spinnerSemana.setAdapter(adapter);

        spinnerSemana.setSelection(Utils.getIndexSpinner(spinnerSemana, Integer.toString(semanaActual)));
        //Comportamiento Spinner
        spinnerSemana.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Semana "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();

                String semanaElegida = parent.getItemAtPosition(position).toString();
                //Colocar imagenes con su recurso
                int identificadoru = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgu"+semanaElegida, null, null);
                imgu.setImageResource(identificadoru);
                int identificadoroe1 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgoe1"+semanaElegida, null, null);
                imgoe1.setImageResource(identificadoroe1);
                int identificadoroe2 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgoe2"+semanaElegida, null, null);
                imgoe2.setImageResource(identificadoroe2);
                int identificadoroe3 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgoe3"+semanaElegida, null, null);
                imgoe3.setImageResource(identificadoroe3);
                int identificadoroe4 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgoe4"+semanaElegida, null, null);
                imgoe4.setImageResource(identificadoroe4);
                int identificadoroe5 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgoe5"+semanaElegida, null, null);
                imgoe5.setImageResource(identificadoroe5);
                int identificadorfg = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgfg"+semanaElegida, null, null);
                imgfg.setImageResource(identificadorfg);
                int identificadorsf1 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgsf1"+semanaElegida, null, null);
                imgsf1.setImageResource(identificadorsf1);
                int identificadorsf2 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgsf2"+semanaElegida, null, null);
                imgsf2.setImageResource(identificadorsf2);
                int identificadorsf3 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgsf3"+semanaElegida, null, null);
                imgsf3.setImageResource(identificadorsf3);
                int identificadorsf4 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgsf4"+semanaElegida, null, null);
                imgsf4.setImageResource(identificadorsf4);
                int identificadorsf5 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgsf5"+semanaElegida, null, null);
                imgsf5.setImageResource(identificadorsf5);
                int identificadorsf6 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgsf6"+semanaElegida, null, null);
                imgsf6.setImageResource(identificadorsf6);
                int identificadorsf7 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgsf7"+semanaElegida, null, null);
                imgsf7.setImageResource(identificadorsf7);
                int identificadorsf8 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgsf8"+semanaElegida, null, null);
                imgsf8.setImageResource(identificadorsf8);
                int identificadorsf9 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgsf9"+semanaElegida, null, null);
                imgsf9.setImageResource(identificadorsf9);
                int identificadorsf10 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgsf10"+semanaElegida, null, null);
                imgsf10.setImageResource(identificadorsf10);
                int identificadorod = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgod"+semanaElegida, null, null);
                imgod.setImageResource(identificadorod);
                int identificadore = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imge"+semanaElegida, null, null);
                imge.setImageResource(identificadore);
                int identificadorc = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgc"+semanaElegida, null, null);
                imgc.setImageResource(identificadorc);
                int identificadorpd1 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgpd1"+semanaElegida, null, null);
                imgpd1.setImageResource(identificadorpd1);
                int identificadorpd2 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgpd2"+semanaElegida, null, null);
                imgpd2.setImageResource(identificadorpd2);
                int identificadorpd3 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgpd3"+semanaElegida, null, null);
                imgpd3.setImageResource(identificadorpd3);
                int identificadorpd4 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgpd4"+semanaElegida, null, null);
                imgpd4.setImageResource(identificadorpd4);
                int identificadorpd5 = getResources().getIdentifier("com.example.guiapkmnshuffle:drawable/imgpd5"+semanaElegida, null, null);
                imgpd5.setImageResource(identificadorpd5);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    //Calcula en que dia estamos entre 1 y 168 (24 semanas)
    public int calcularDiasDiferencia() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente
        int agno = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        String fechaActual = ""+agno+"-"+(mes+1)+"-"+dia;


        Date fechaInicial=dateFormat.parse("2019-07-02");
        Date fechaFinal=dateFormat.parse(fechaActual);

        int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
        dias = dias%168;
        return dias;
    }

    //Cambia el texto del dia al dia actual
    public void colocarDiaActual(){
        //Instanciamos el objeto Calendar
        //en fecha obtenemos la fecha y hora del sistema
        Calendar fecha = new GregorianCalendar();
        //Obtenemos el valor del año, mes, día,
        //hora, minuto y segundo del sistema
        //usando el método get y el parámetro correspondiente
        int agno = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        String fechaActual = ""+dia+"/"+(mes+1)+"/"+agno;

        textoDiaActual.setText("Hoy: "+fechaActual);
    }
}
