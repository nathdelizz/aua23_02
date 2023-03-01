package com.example.aua23_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreditosActivity extends AppCompatActivity {

    Button buttonVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);
        buttonVoltar=findViewById(R.id.buttonVoltarCred);

        buttonVoltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent in = new Intent(CreditosActivity.this, MenuActivity.class);
                startActivity(in);
            }
        });
    }
}