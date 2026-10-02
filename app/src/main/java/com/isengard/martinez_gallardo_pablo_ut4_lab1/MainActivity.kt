package com.isengard.martinez_gallardo_pablo_ut4_lab1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val TAG = "MapaMundi"
    private val LogCat: (String) -> Unit = {mensaje -> Log.d(TAG, mensaje)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGondor = findViewById<Button>(R.id.btnGondor)
        val btnRohan = findViewById<Button>(R.id.btnRohan)
        val btnMordor = findViewById<Button>(R.id.btnMordor)

        btnGondor.setOnClickListener {
            LogCat("Has viajado a Gondor")
            Toast.makeText(this, "Has viajado a Gondor", Toast.LENGTH_SHORT).show()
        }

        btnRohan.setOnClickListener {
            LogCat("Has viajado a Rohan")
            Toast.makeText(this, "Has viajado a Rohan", Toast.LENGTH_SHORT).show()
        }

        btnMordor.setOnClickListener {
            LogCat("Has viajado a Mordor")
            Toast.makeText(this, "Has viajado a Mordor", Toast.LENGTH_SHORT).show()
        }
    }
}