package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ODS5Activity extends AppCompatActivity {

    Button voltar5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods5);

        //BOTAO VOLTAR
        voltar5 = findViewById(R.id.voltar5);
        voltar5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent( getApplicationContext(), MainActivity.class);
                startActivity( MainActivity);
            }
        });
    }
}