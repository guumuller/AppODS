package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ODS1Activity extends AppCompatActivity {

    Button voltar1, voltar2, voltar3, voltar4, voltar5, voltar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods1);

        //BOTAO VOLTAR
        voltar1 = findViewById(R.id.voltar1);
        voltar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent( getApplicationContext(), MainActivity.class);
                startActivity( MainActivity);
            }
        });
    }
}