package com.example.actividades
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivityTrabajadores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trabajadores)

        val etTrabajadores = findViewById<EditText>(R.id.etTrabajadores)
        val etDiasIniciales = findViewById<EditText>(R.id.etDiasIniciales)
        val btnCalcularDias = findViewById<Button>(R.id.btnCalcularDias)
        val tvResultadoDias = findViewById<TextView>(R.id.tvResultadoDias)

        btnCalcularDias.setOnClickListener {
            val trabajadores = etTrabajadores.text.toString().toInt()
            val diasIniciales = etDiasIniciales.text.toString().toInt()

            // Cálculo de días necesarios con la regla de 4 trabajadores en 6 días
            val diasNecesarios = (4 * diasIniciales) / trabajadores
            tvResultadoDias.text = "Días necesarios: $diasNecesarios"
        }
    }
}