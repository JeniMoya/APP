package com.example.app4ta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {
    private EditText etNombre, etEmail, etContraseña;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        etNombre = findViewById(R.id.etNombre);
        etEmail = findViewById(R.id.etEmail);
        etContraseña = findViewById(R.id.etContraseña);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString();
                String email = etEmail.getText().toString();
                String contraseña = etContraseña.getText().toString();

                // Realiza la validación y procesamiento de datos aquí

                // Ejemplo de muestra de un mensaje
                Toast.makeText(Registro.this, "Nombre: " + nombre + ", Email: " + email+ ", Contraseña: " + contraseña , Toast.LENGTH_SHORT).show();
            }
        });
    }
}