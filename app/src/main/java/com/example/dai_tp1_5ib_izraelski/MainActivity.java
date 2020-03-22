package com.example.dai_tp1_5ib_izraelski;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnEj1 , btnEj2, btnEj3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setReferencias();
        setButtonListeners();
    }
    public void setReferencias(){
        btnEj1 = findViewById(R.id.ButtonEj1);
        btnEj2 = findViewById(R.id.ButtonEj2);
        btnEj3 = findViewById(R.id.ButtonEj3);
    }
    public void setButtonListeners(){
        btnEj1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickEj1();
            }
        });
        btnEj2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //clickEj2();
            }
        });
        btnEj3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // clickEj3();
            }
        });
    }

    public void clickEj1(){
        Intent Llamada;
        Llamada=new Intent(MainActivity.this, Ejercicio_1.class);
        startActivity(Llamada);
    }
    /*public void clickEj2(){
        Intent Llamada;
        Llamada=new Intent(MainActivity.this, Ejercicio_2.class);
        startActivity(Llamada);
    }
    public void clickEj3(){
        Intent Llamada;
        Llamada=new Intent(MainActivity.this, Ejercicio_3.class);
        startActivity(Llamada);
    }*/
}


