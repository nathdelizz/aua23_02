package com.example.aua23_02;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonIrCadastro;
    TextView etNome;
    TextView etEmail;
    TextView etTelefone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIrCadastro=findViewById(R.id.buttonIrCadastro);


        buttonIrCadastro.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, Cadastro_activity.class);
                in.putExtra("Nome", etNome.getText().toString());
                in.putExtra("Email", etEmail.getText().toString());
                in.putExtra("Telefone", etTelefone.getText().toString());

                startActivity(in);

            }
        });
    }
}