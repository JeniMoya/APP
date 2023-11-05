package com.example.app4ta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText etEmail, etContraseña;
    private Button btnIniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etEmail = findViewById(R.id.etEmail);
        etContraseña = findViewById(R.id.etContraseña);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = etEmail.getText().toString();
                String password = etContraseña.getText().toString();

                if (email.equals("usuario@example.com") && password.equals("contraseña")) {
                    String mensajeBienvenida = "Bienvenido, " + email;
                    Toast.makeText(MainActivity2.this, mensajeBienvenida, Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(MainActivity2.this, "Inicio de sesión fallido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}