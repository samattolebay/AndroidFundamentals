package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fifteen2.*

class Fifteen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifteen2)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 18)
        val country = intent.getStringExtra("EXTRA_COUNTRY")

        val text = "$name is $age years old living in $country"
        tvInfo.text = text

        btnBack.setOnClickListener {
            finish()
        }
    }
}