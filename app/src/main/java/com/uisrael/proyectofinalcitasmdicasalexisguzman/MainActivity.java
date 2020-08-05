package com.uisrael.proyectofinalcitasmdicasalexisguzman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String user=new String("ad");
    String pass=("123ad");
    EditText etUsuario, etContraseña;
    Button Registrarse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario=findViewById(R.id.etUsuarioL);
        etContraseña=findViewById(R.id.etContraseñaL);

        Registrarse=findViewById(R.id.btnRegistrarse);
    }

    public void Ingresar(View v){
        if (etUsuario.getText().toString().equals(user)) {

            if (etContraseña.getText().toString().equals(pass)) {
                Intent intent = new Intent(MainActivity.this,Agendamiento.class);
    
                startActivity(intent);

            } else {

                Toast.makeText(getApplicationContext(), "Acceso exitoso", Toast.LENGTH_LONG).show();
            }

        } else {

            Toast.makeText(getApplicationContext(), "Usuario o Clave incorrectos", Toast.LENGTH_LONG).show();
        }
    }

    public void Registrarse(View v){
        Intent intent2 = new Intent(MainActivity.this,Registro.class);
        startActivity(intent2);
    }





}
