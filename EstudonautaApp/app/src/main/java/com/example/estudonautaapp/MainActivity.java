package com.example.estudonautaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicouEquipe(View view) {
        tela = new Intent(getApplicationContext(), Equipe.class);
        startActivity(tela);
    }

    public void clicouCursos(View view) {
        tela = new Intent(getApplicationContext(), Cursos.class);
        startActivity(tela);
    }

    public void clicouMidia(View view) {

    }
}