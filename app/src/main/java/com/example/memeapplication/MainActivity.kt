package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvmeme1:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvmeme1 = findViewById(R.id.tvmeme1)
        tvmeme1.setOnClickListener {
            val intent = Intent(this,secondMeme::class.java)
            startActivity(intent)
        }
    }
}