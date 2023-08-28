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
    }
}

