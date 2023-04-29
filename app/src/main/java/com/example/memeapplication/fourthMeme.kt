package com.example.memeapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class fourthMeme : AppCompatActivity() {
    lateinit var tvButton4:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_meme)
        tvButton4 = findViewById(R.id.tvButton4)
        tvButton4.setOnClickListener {
            val intent = Intent(this,fifthMeme::class.java)
            startActivity(intent)
        }
    }
}