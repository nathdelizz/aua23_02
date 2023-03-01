package com.example.aua23_02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    Button buttonCadastro;
    Button buttonCreditos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonCadastro=findViewById(R.id.buttonCadastro);

        buttonCadastro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MenuActivity.this, CadastroActivity.class);
                    startActivity(in);
            }
        });

        buttonCreditos=findViewById(R.id.buttonCreditos);

        buttonCreditos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MenuActivity.this, CreditosActivity.class);
                startActivity(in);
            }
        });
    }
}

