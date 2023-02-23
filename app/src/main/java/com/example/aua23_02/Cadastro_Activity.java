package com.example.aua23_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class Cadastro_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent it = getIntent();

        String Nome = it.getStringExtra("Nome");
        String Email = it.getStringExtra("Email");
        String Telefone = it.getStringExtra("Telefone");

        Cadastro_activity.setText(Nome+"\n"+Email);
    }
}