package com.example.activadclase

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val editText = findViewById<EditText>(R.id.etInput)
        val button = findViewById<Button>(R.id.btnSolve)

        button.setOnClickListener {
            val inputText = editText.text.toString()
            val words = inputText.split(" ")

            if (words.size == 2) {
                val result = "${words[1]}, ${words[0]}"
                Toast.makeText(this, result, Toast.LENGTH_SHORT).show() // Mostrar el resultado en un Toast
            } else {
                Toast.makeText(this, "Por favor, ingresa solo dos palabras", Toast.LENGTH_SHORT).show()
            }
        }
    }
}