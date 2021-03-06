package com.example.dai_tp1_5ib_izraelski;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio_1 extends AppCompatActivity {
    EditText edtTexto1,edtTexto2;
    TextView txtLength, txtExcedente, txt3Primeros, txtProgreso;
    Button btnVolver, btnMostrar;
    SeekBar seekBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_1);
        setReferencias();
        setButtonListeners();
    }

    public void setReferencias(){
        edtTexto1=findViewById(R.id.Text1);
        edtTexto2=findViewById(R.id.Text2);
        txtLength=findViewById(R.id.TextViewLength);
        txtExcedente=findViewById(R.id.TextViewExcede);
        txt3Primeros=findViewById(R.id.TextView3Primeros);
        btnVolver = findViewById(R.id.ButtonVolver);
        btnMostrar = findViewById(R.id.ButtonMostrar);
        txtProgreso = findViewById(R.id.txtProgreso);
        seekBar = findViewById(R.id.SeekBar);

    }

    public void setButtonListeners(){
        btnVolver.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickVolver();
            }
        });
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clickMostrar();
            }
        });
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtProgreso.setText(""+progress+"");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void clickVolver() {
        Intent Llamada;
        Llamada=new Intent(this, MainActivity.class);
        startActivity(Llamada);
    }

    public void clickMostrar() {
        String strTexto1 , strTexto2, strConcatenado;
        Integer Cant1, Cant2, Excedente;

        if (!(edtTexto1 == null)) {
            strTexto1 = edtTexto1.getText().toString();
        } else { strTexto1 = "";}
        if (!(edtTexto2 == null)){
        strTexto2 = edtTexto2.getText().toString();
        } else { strTexto2 = "";}

        Cant1 = strTexto1.length();
        Cant2 = strTexto2.length();
        if(Cant1 == 0 || Cant2 == 0){
            Toast.makeText(this, "Ingresa algo, cabron", Toast.LENGTH_SHORT).show();

        }
        else{
            txtLength.setText("La primera palabra tiene " + Cant1 + " letras, y la segunda " + Cant2);
            if(Cant1>Cant2){
                Excedente = Cant1-Cant2;
                txtExcedente.setText("La primera palabra tiene " + Excedente + " letras mas que la segunda.");
            }
            else{
                Excedente=Cant2-Cant1;
                txtExcedente.setText("La segunda palabra tiene " + Excedente + " letras mas que la primera.");
            }
            Integer iProgreso;
            iProgreso=seekBar.getProgress();
            if(Cant1 >= iProgreso && Cant2 >= iProgreso) {
                strConcatenado = strTexto1.substring(0, iProgreso) + strTexto2.substring(0, iProgreso);
                txt3Primeros.setText("La concatenacion seria: "+strConcatenado);
            }
        }
    }
}
