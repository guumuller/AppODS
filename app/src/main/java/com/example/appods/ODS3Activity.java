package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ODS3Activity extends AppCompatActivity {

    Button voltar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ods3);

        //BOTAO VOLTAR
        voltar3 = findViewById(R.id.voltar3);
        voltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent( getApplicationContext(), MainActivity.class);
                startActivity( MainActivity);
            }
        });
    }
}