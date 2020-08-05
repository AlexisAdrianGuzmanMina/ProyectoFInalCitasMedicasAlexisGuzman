package com.uisrael.proyectofinalcitasmdicasalexisguzman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AgendarEspecialidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar_especialidad);
    }

    public void AgendarE(View v){
        Intent intent5 = new Intent(AgendarEspecialidad.this,AgendarFecha.class);
        startActivity(intent5);
    }
}
