package com.example.m201_intents_1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txt_nom = findViewById<TextView>(R.id.textView)
        val txt_prenom = findViewById<TextView>(R.id.textView2)
        val txt_age = findViewById<TextView>(R.id.textView3)

        val nom = intent.getStringExtra("Nom")
        val prenom = intent.getStringExtra("Prenom")
        val age = intent.getIntExtra("Age", 24)

        txt_nom.text = nom
        txt_prenom.text = prenom
        txt_age.text = age.toString()

    }
}