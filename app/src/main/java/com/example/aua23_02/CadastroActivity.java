package com.example.aua23_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
    Button buttonVoltar;
    EditText etNome;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etNome=findViewById(R.id.etNome);

        buttonVoltar=findViewById(R.id.buttonVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent in = new Intent(CadastroActivity.this, MenuActivity.class);
                startActivity(in);
            }
        });

        //
        //Intent it = getIntent();

        //String Nome = it.getStringExtra("Nome");
        //String Email = it.getStringExtra("Email");
        //String Telefone = it.getStringExtra("Telefone");

        //etNome.setText(Nome);

    }
}