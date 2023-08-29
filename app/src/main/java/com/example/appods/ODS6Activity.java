package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ODS6Activity extends AppCompatActivity {

    Button voltar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods6);

        //BOTAO VOLTAR
        voltar6 = findViewById(R.id.voltar6);
        voltar6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent( getApplicationContext(), MainActivity.class);
                startActivity( MainActivity);
            }
        });
    }
}