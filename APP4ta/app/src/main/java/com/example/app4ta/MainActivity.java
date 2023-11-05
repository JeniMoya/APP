package com.example.app4ta;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import android.os.Bundle;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_menu, menu);
        return true;
    }
}
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.nav_Inicio:
                // Lógica para la opción 1
                Toast.makeText(this, "Opción 1 seleccionada", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nav_perfil:
                // Lógica para la opción 2
                Toast.makeText(this, "Opción 2 seleccionada", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nav_configuracion:
                // Lógica para la opción 3
                Toast.makeText(this, "Opción 3 seleccionada", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

}