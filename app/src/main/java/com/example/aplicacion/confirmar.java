package com.example.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class confirmar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirmar);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //  AGREGAR ESTO - Recuperar datos del Intent
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String apellidos = intent.getStringExtra("apellidos");
        String domicilio = intent.getStringExtra("domicilio");
        String dni = intent.getStringExtra("dni");
        String email = intent.getStringExtra("email");
        String cuentaBancaria = intent.getStringExtra("cuentaBancaria");

        //  AGREGAR ESTO - Asignar a cada TextView
        TextView tvNombre = findViewById(R.id.tvNombre);
        TextView tvApellidos = findViewById(R.id.tvApellidos);
        TextView tvDomicilio = findViewById(R.id.tvDomicilio);
        TextView tvDNI = findViewById(R.id.tvDNI);
        TextView tvEmail = findViewById(R.id.tvEmail);
        TextView tvCuentaBancaria = findViewById(R.id.tvCuentaBancaria);

        //  AGREGAR ESTO - Mostrar los datos
        if (nombre != null) tvNombre.setText("Nombre: " + nombre);
        if (apellidos != null) tvApellidos.setText("Apellidos: " + apellidos);
        if (domicilio != null) tvDomicilio.setText("Domicilio: " + domicilio);
        if (dni != null) tvDNI.setText("DNI: " + dni);
        if (email != null) tvEmail.setText("Email: " + email);
        if (cuentaBancaria != null) tvCuentaBancaria.setText("Cuenta Bancaria: " + cuentaBancaria);
    }

    public void lanzarMenu(View view){
        Intent lanzadorMenu=new Intent(this, Menu.class);
        startActivity(lanzadorMenu);
    }

}