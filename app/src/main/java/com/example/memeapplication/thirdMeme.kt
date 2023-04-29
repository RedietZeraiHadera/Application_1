package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class thirdMeme : AppCompatActivity() {
    lateinit var tvButton3:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_meme)
        tvButton3 = findViewById(R.id.tvButton3)
        tvButton3.setOnClickListener {
            val intent = Intent(this,fourthMeme::class.java)
            startActivity(intent)
        }
    }
}