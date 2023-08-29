package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ODS2Activity extends AppCompatActivity {

    Button voltar1, voltar2, voltar3, voltar4, voltar5, voltar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods2);

        //BOTAO VOLTAR
        voltar2 = findViewById(R.id.voltar2);
        voltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent( getApplicationContext(), MainActivity.class);
                startActivity( MainActivity);
            }
        });
    }
}