package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eleven.*

class ElevenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eleven)

        btnAddImage.setOnClickListener {
            ivImage.setImageResource(R.drawable.philipp_logo)
        }
    }
}