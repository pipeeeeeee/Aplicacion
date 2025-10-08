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

public class Vender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vender);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void publicarVideojuego(View view) {
        // Obtener referencia al EditText del título
        EditText etTitulo = findViewById(R.id.etTitulo);

        // Obtener el valor del título
        String tituloVideojuego = etTitulo.getText().toString();

        // Crear Intent y añadir datos (solo el título como pide el enunciado)
        Intent intent = new Intent(this, ConfirmarVenta.class);
        intent.putExtra("tituloVideojuego", tituloVideojuego);

        // Iniciar la nueva Activity
        startActivity(intent);
    }
}