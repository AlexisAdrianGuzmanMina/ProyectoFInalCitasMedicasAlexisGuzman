package com.uisrael.proyectofinalcitasmdicasalexisguzman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Registro extends AppCompatActivity {
    EditText etnombre, etciudad, etcontraseña;
    String name= "";
    String city= "";
    String password= "";

    FirebaseAuth Auth;
    DatabaseReference Database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Auth = FirebaseAuth.getInstance();
        Database = FirebaseDatabase.getInstance().getReference();

        etnombre=findViewById(R.id.etNombrerR);
        etciudad=findViewById(R.id.etCiudadR);
        etcontraseña=findViewById(R.id.etContraseñaR);
    }

    public void Registrar(View v){
        Intent intent3 = new Intent(Registro.this,Agendamiento.class);
        name = etnombre.getText().toString();
        city = etciudad.getText().toString();
        password = etcontraseña.getText().toString();

        if (!name.isEmpty()&& !city.isEmpty()&&!password.isEmpty()){
            if (password.length()>=6){
                registerUser();
                startActivity(intent3);
        } else{
                Toast.makeText(this, "La contraseña debe tener mínimo 6 caracteres", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(this, "Debe completar los campos", Toast.LENGTH_SHORT).show();
        }
        //startActivity(intent3);
    }
    public void registerUser(){
        Auth.createUserWithEmailAndPassword(city,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){

                }
                else{
                    Toast.makeText(Registro.this, "No se pudo resgistrar correctamente", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}




