package com.example.m201_intents_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ed_nom = findViewById<EditText>(R.id.editText1)
        val ed_prenom = findViewById<EditText>(R.id.editText2)
        val ed_age = findViewById<EditText>(R.id.editText3)
        val btn_env = findViewById<Button>(R.id.buttonEnvoyer)

        btn_env.setOnClickListener{

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("Nom", ed_nom.text.toString())
            intent.putExtra("Prenom", ed_prenom.text.toString())
            intent.putExtra("Age", ed_age.text.toString().toInt())

            startActivity(intent)



        }

    }
}