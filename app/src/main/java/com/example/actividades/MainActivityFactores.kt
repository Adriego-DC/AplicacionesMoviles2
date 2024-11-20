package com.example.actividades
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityFactores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factores)

        val btnFactores60 = findViewById<Button>(R.id.btnFactores60)
        val tvResultadoFactores = findViewById<TextView>(R.id.tvResultadoFactores)

        btnFactores60.setOnClickListener {
            val factores = listarFactores(60)
            val resultado = "Factores de 60: $factores\nEs un número compuesto"
            tvResultadoFactores.text = resultado
        }
    }

    private fun listarFactores(numero: Int): String {
        val factores = mutableListOf<Int>()
        for (i in 1..numero) {
            if (numero % i == 0) {
                factores.add(i)
            }
        }
        return factores.joinToString(", ")
    }
}