package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnEjercicio1, btnEjercicio2,btnEjercicio3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEjercicio1=findViewById(R.id.btn_ejercicio1);
        btnEjercicio2=findViewById(R.id.btn_ejercicio2);
        btnEjercicio3=findViewById(R.id.btn_ejercicio3);

        btnEjercicio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ejercicio1.class);
                startActivity(intent);
            }
        });

        btnEjercicio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ejercicio2.class);
                startActivity(intent);
            }
        });

        btnEjercicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ejercicio3.class);
                startActivity(intent);
            }
        });
    }
}