package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class secondMeme : AppCompatActivity() {
    lateinit var tvButton2:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_meme)
        tvButton2 = findViewById(R.id.tvButton2)
        tvButton2.setOnClickListener{
            val intent = Intent(this,thirdMeme::class.java)
            startActivity(intent)
        }

    }
}