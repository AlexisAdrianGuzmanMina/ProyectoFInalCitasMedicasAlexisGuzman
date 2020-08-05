package com.uisrael.proyectofinalcitasmdicasalexisguzman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Agendamiento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendamiento);
    }

    public void Agendar(View v){
        Intent intent4 = new Intent(Agendamiento.this, AgendarEspecialidad.class);
        startActivity(intent4);
    }
}
