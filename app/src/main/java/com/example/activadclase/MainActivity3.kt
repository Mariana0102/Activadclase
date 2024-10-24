package com.example.activadclase

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity3: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val etInput = findViewById<TextInputEditText>(R.id.etInput)
        val btnSolve = findViewById<Button>(R.id.btnSolve)


        btnSolve.setOnClickListener {
            val inputText = etInput.text.toString()

            if (inputText.isNotEmpty()) {
                val result = solveTwoHalves(inputText)
                Toast.makeText(this, result, Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Por favor ingresa una cadena de texto", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Función para resolver el problema de las dos mitades
    private fun solveTwoHalves(text: String): String {
        val length = text.length
        val mid = length / 2

        return if (length % 2 == 0) {
            val firstHalf = text.substring(0, mid)
            val secondHalf = text.substring(mid)
            "$secondHalf$firstHalf"
        } else {
            val firstHalf = text.substring(0, mid + 1)
            val secondHalf = text.substring(mid + 1)
            "$secondHalf$firstHalf"

        }
    }
}