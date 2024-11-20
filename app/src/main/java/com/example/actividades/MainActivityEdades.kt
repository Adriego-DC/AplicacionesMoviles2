package com.example.actividades
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityEdades : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edades)

        val etEdadAna = findViewById<EditText>(R.id.etEdadAna)
        val btnCalcularEdades = findViewById<Button>(R.id.btnCalcularEdades)
        val tvResultadoEdades = findViewById<TextView>(R.id.tvResultadoEdades)

        btnCalcularEdades.setOnClickListener {
            val edadAna = etEdadAna.text.toString().toInt()
            val edadJuan = edadAna - 5
            tvResultadoEdades.text = "Edad de Ana: $edadAna\nEdad de Juan: $edadJuan"
        }
    }
}