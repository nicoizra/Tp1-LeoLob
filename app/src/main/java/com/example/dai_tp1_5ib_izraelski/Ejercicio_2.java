package com.example.dai_tp1_5ib_izraelski;

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

public class Ejercicio_2 extends AppCompatActivity {
    Button btnVolver, btnVer;
    CheckBox checkBox;
    EditText edtTexto;
    TextView txtAlerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_2);
        setReferencias();
        setListeners();
    }

    private void setReferencias(){
        btnVolver=findViewById(R.id.ButtonVolver);
        btnVer=findViewById(R.id.ButtonVer);
        checkBox=findViewById(R.id.Checkbox);
        edtTexto=findViewById(R.id.Texto);
        txtAlerta=findViewById(R.id.TxtAlerta);
    }

    private void setListeners(){

        btnVolver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickVolver();
            }
        });

        btnVer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickVer();
            }
        });

    }

    private void clickVolver() {
        Intent Llamada;
        Llamada=new Intent(this, MainActivity.class);
        startActivity(Llamada);
    }

    private void clickVer() {
        if(checkBox.isChecked() && edtTexto.getText().toString().length() <= 10){
            Toast.makeText(this, "El texto no tiene mas de 10 caracteres", Toast.LENGTH_SHORT).show();
        }
    }
}
