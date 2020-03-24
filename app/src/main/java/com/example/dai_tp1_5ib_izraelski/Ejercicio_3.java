package com.example.dai_tp1_5ib_izraelski;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.os.Bundle;

public class Ejercicio_3 extends AppCompatActivity {
    Button btnInvertir, btnVolver;
    EditText edtTexto;
    TextView txtTextoInvertido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_3);

        setReferencias();
        setListeners();
    }

    private void setReferencias(){
        btnVolver=findViewById(R.id.ButtonVolver);
        btnInvertir=findViewById(R.id.ButtonInvertir);
        edtTexto=findViewById(R.id.TextoAInvertir);
        txtTextoInvertido=findViewById(R.id.TxtInvertido);
    }

    private void setListeners(){
        btnVolver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickVolver();
            }
        });
        btnInvertir.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickInvertir();
            }
        });
    }

    private void clickVolver(){
        Intent Llamada;
        Llamada=new Intent(this, MainActivity.class);
        startActivity(Llamada);
    }

    private void clickInvertir(){
        String strTexto="", strTextoInvertido="";
        strTexto=edtTexto.getText().toString();
        if(strTexto.length()<10){
            txtTextoInvertido.setText("");
            Toast.makeText(this, "La idea es que tenga mas de 10 caracteres", Toast.LENGTH_SHORT).show();
        }
        else{
            for(Integer i = strTexto.length()-1;i >= 0;i--){
                strTextoInvertido = strTextoInvertido + strTexto.charAt(i);
            }

            txtTextoInvertido.setText(strTextoInvertido);
        }


    }
}
