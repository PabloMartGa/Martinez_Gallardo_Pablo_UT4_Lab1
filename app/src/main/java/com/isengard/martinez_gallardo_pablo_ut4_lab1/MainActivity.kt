package com.isengard.martinez_gallardo_pablo_ut4_lab1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val TAG = "MapaMundi"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGondor = findViewById<ImageButton>(R.id.btnGondor)
        val btnRohan = findViewById<ImageButton>(R.id.btnRohan)
        val btnMordor = findViewById<ImageButton>(R.id.btnMordor)

        btnGondor.setOnClickListener {
            Toast.makeText(this, R.string.viaje_gondor, Toast.LENGTH_SHORT).show()
        }

        btnRohan.setOnClickListener {
            Toast.makeText(this, R.string.viaje_rohan, Toast.LENGTH_SHORT).show()
        }

        btnMordor.setOnClickListener {
            Toast.makeText(this, R.string.viaje_mordor, Toast.LENGTH_SHORT).show()
        }
    }
}