package com.example.actividades

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botón para ir a la actividad de verificar número primo
        val btnPrimo = findViewById<Button>(R.id.btnPrimo)
        btnPrimo.setOnClickListener {
            val intent = Intent(this, MainActivityPrimo::class.java)
            startActivity(intent)
        }

        // Botón para ir a la actividad de calcular edades
        val btnEdades = findViewById<Button>(R.id.btnEdades)
        btnEdades.setOnClickListener {
            val intent = Intent(this, MainActivityEdades::class.java)
            startActivity(intent)
        }

        // Botón para ir a la actividad de calcular área del triángulo
        val btnArea = findViewById<Button>(R.id.btnArea)
        btnArea.setOnClickListener {
            val intent = Intent(this, MainActivityArea::class.java)
            startActivity(intent)
        }

        // Botón para ir a la actividad de calcular días de trabajo
        val btnTrabajadores = findViewById<Button>(R.id.btnTrabajadores)
        btnTrabajadores.setOnClickListener {
            val intent = Intent(this, MainActivityTrabajadores::class.java)
            startActivity(intent)
        }

        // Botón para ir a la actividad de ver factores de 60
        val btnFactores = findViewById<Button>(R.id.btnFactores)
        btnFactores.setOnClickListener {
            val intent = Intent(this, MainActivityFactores::class.java)
            startActivity(intent)
        }

        // Botón para ir a la actividad de verificar si un número es compuesto
        val btnCompuesto = findViewById<Button>(R.id.btnCompuesto)
        btnCompuesto.setOnClickListener {
            val intent = Intent(this, MainActivityCompuesto::class.java)
            startActivity(intent)
        }
    }
}