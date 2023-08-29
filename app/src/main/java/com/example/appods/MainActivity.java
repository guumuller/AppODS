package com.example.appods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnODS1, btnODS2, btnODS3, btnODS4, btnODS5, btnODS6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BOTAO ODS1
        btnODS1 = findViewById(R.id.btnODS1);
        btnODS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS1Activity = new Intent( getApplicationContext(), ODS1Activity.class);
                startActivity( ODS1Activity);
            }
        });
        //BOTAO ODS2
        btnODS2 = findViewById(R.id.btnODS2);
        btnODS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS2Activity = new Intent( getApplicationContext(), ODS2Activity.class);
                startActivity( ODS2Activity);
            }
        });
        //BOTAO ODS3
        btnODS3 = findViewById(R.id.btnODS3);
        btnODS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS3Activity = new Intent( getApplicationContext(), ODS3Activity.class);
                startActivity( ODS3Activity);
            }
        });
        //BOTAO ODS4
        btnODS4 = findViewById(R.id.btnODS4);
        btnODS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS4Activity = new Intent( getApplicationContext(), ODS4Activity.class);
                startActivity( ODS4Activity);
            }
        });
        //BOTAO ODS5
        btnODS5 = findViewById(R.id.btnODS5);
        btnODS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS5Activity = new Intent( getApplicationContext(), ODS5Activity.class);
                startActivity( ODS5Activity);
            }
        });
        //BOTAO ODS6
        btnODS6 = findViewById(R.id.btnODS6);
        btnODS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ODS6Activity = new Intent( getApplicationContext(), ODS6Activity.class);
                startActivity( ODS6Activity);
            }
        });
    }
}

