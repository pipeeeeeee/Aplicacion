package com.example.aplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ConfirmarVenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirmar_venta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Recibir datos del Intent
        Intent intent = getIntent();
        String tituloVideojuego = intent.getStringExtra("tituloVideojuego");

        // Mostrar confirmación
        TextView tvConfirmacion = findViewById(R.id.tvConfirmacion);
        if (tituloVideojuego != null && !tituloVideojuego.isEmpty()) {
            tvConfirmacion.setText("¡Videojuego '" + tituloVideojuego + "' publicado exitosamente!");
        } else {
            tvConfirmacion.setText("¡Videojuego publicado exitosamente!");
        }
    }
}