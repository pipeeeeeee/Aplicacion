package com.example.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }




    public void enviarDatos(View view) {
        // Obtener referencias a los EditText
        EditText etNombre = findViewById(R.id.etNombre);
        EditText etApellidos = findViewById(R.id.etApellidos);
        EditText etDomicilio = findViewById(R.id.etDomicilio);
        EditText etDNI = findViewById(R.id.etDNI);
        EditText etEmail = findViewById(R.id.etEmail);
        EditText etCuentaBancaria = findViewById(R.id.etCuentaBancaria);

        // Obtener los valores
        String nombre = etNombre.getText().toString();
        String apellidos = etApellidos.getText().toString();
        String domicilio = etDomicilio.getText().toString();
        String dni = etDNI.getText().toString();
        String email = etEmail.getText().toString();
        String cuentaBancaria = etCuentaBancaria.getText().toString();

        // Crear Intent y añadir datos
        Intent intent = new Intent(this, confirmar.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("apellidos", apellidos);
        intent.putExtra("domicilio", domicilio);
        intent.putExtra("dni", dni);
        intent.putExtra("email", email);
        intent.putExtra("cuentaBancaria", cuentaBancaria);

        // Iniciar la nueva Activity
        startActivity(intent);
    }
}

