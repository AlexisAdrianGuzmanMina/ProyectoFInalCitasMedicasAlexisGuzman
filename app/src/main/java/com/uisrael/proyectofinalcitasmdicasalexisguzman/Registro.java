package com.uisrael.proyectofinalcitasmdicasalexisguzman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Registro extends AppCompatActivity {
    EditText etnombre, etciudad, etcontraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro                                                                                           );
        etnombre=findViewById(R.id.etNombrerR);
        etciudad=findViewById(R.id.etCiudadR);
        etcontraseña=findViewById(R.id.etContraseñaR);
    }

    public void Registrar(View v){
        Intent intent3 = new Intent(Registro.this,Agendamiento.class);
        startActivity(intent3);
    }


}
