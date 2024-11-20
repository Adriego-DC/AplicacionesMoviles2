package com.example.actividades
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityCompuesto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compuesto)

        val etNumeroCompuesto = findViewById<EditText>(R.id.etNumeroCompuesto)
        val btnVerificarCompuesto = findViewById<Button>(R.id.btnVerificarCompuesto)
        val tvResultadoCompuesto = findViewById<TextView>(R.id.tvResultadoCompuesto)

        btnVerificarCompuesto.setOnClickListener {
            val numero = etNumeroCompuesto.text.toString().toInt()
            val esCompuesto = esNumeroCompuesto(numero)
            tvResultadoCompuesto.text = if (esCompuesto) "Es un número compuesto" else "No es un número compuesto"
        }
    }

    private fun esNumeroCompuesto(numero: Int): Boolean {
        if (numero <= 1) return false
        for (i in 2 until numero) {
            if (numero % i == 0) return true
        }
        return false
    }
}