package com.uisrael.proyectofinalcitasmdicasalexisguzman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AgendarFecha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar_fecha);
    }

    public void AgendarF(View v){
        Intent intent6 = new Intent(AgendarFecha.this,AgendarInfo.class);
        startActivity(intent6);
    }

}