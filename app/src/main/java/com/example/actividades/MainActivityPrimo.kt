package com.example.actividades
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityPrimo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primo)

        val etNumeroPrimo = findViewById<EditText>(R.id.etNumeroPrimo)
        val btnVerificarPrimo = findViewById<Button>(R.id.btnVerificarPrimo)
        val tvResultadoPrimo = findViewById<TextView>(R.id.tvResultadoPrimo)

        btnVerificarPrimo.setOnClickListener {
            val numero = etNumeroPrimo.text.toString().toInt()
            val esPrimo = esNumeroPrimo(numero)
            tvResultadoPrimo.text = if (esPrimo) "Es un número primo" else "No es un número primo"
        }
    }

    private fun esNumeroPrimo(numero: Int): Boolean {
        if (numero <= 1) return false
        for (i in 2 until numero) {
            if (numero % i == 0) return false
        }
        return true
    }
}