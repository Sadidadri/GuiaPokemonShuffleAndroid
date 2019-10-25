package com.example.guiapkmnshuffle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class infoapp extends AppCompatActivity {
    Button btnInstagram;
    Button btnTwitter;
    Button btnLinkedin;
    Button btnGithub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infoapp);

        btnInstagram = findViewById(R.id.btn_instagram);
        btnTwitter = findViewById(R.id.btn_twitter);
        btnLinkedin = findViewById(R.id.btn_linkedin);
        btnGithub = findViewById(R.id.btn_github);
    }
    public void clickInstagram(View v){
        Uri uri = Uri.parse("https://www.instagram.com/dripatati/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void clickTwitter(View v){
        Uri uri = Uri.parse("https://twitter.com/XSadidAdriX");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void clickLinkedin(View v){
        Uri uri = Uri.parse("https://www.linkedin.com/in/adri%C3%A1n-%C3%A1ngel-moya-moruno-bb191617a/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void clickGithub(View v){
        Uri uri = Uri.parse("https://github.com/Sadidadri");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
