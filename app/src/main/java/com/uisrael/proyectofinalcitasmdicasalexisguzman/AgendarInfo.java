package com.uisrael.proyectofinalcitasmdicasalexisguzman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AgendarInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar_info);
    }

    public void AgendarInf(View v){
        Intent intent5 = new Intent(AgendarInfo.this,Agendamiento.class);
        startActivity(intent5);
    }
}
