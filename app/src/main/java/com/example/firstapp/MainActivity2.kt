package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonUpload = findViewById<Button>(R.id.btnUpload)
        val buttonDownload = findViewById<Button>(R.id.btnDownload)

        buttonUpload.setOnClickListener{
            Toast.makeText(applicationContext, "I Love You PP...", Toast.LENGTH_SHORT).show()
        }
        buttonDownload.setOnClickListener{
            Toast.makeText(applicationContext, "I Love You Arif...", Toast.LENGTH_SHORT).show()
        }
    }
}