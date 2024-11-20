package com.example.actividades
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityArea : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_area)

        val etBase = findViewById<EditText>(R.id.etBase)
        val etAltura = findViewById<EditText>(R.id.etAltura)
        val btnCalcularArea = findViewById<Button>(R.id.btnCalcularArea)
        val tvResultadoArea = findViewById<TextView>(R.id.tvResultadoArea)

        btnCalcularArea.setOnClickListener {
            val base = etBase.text.toString().toDouble()
            val altura = etAltura.text.toString().toDouble()
            val area = (base * altura) / 2
            tvResultadoArea.text = "Área del triángulo: $area"
        }
    }
}