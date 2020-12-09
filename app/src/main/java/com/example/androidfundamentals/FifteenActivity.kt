package com.example.androidfundamentals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fifteen.*

class FifteenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifteen)

        btnApply.setOnClickListener {
            Intent(this, Fifteen2Activity::class.java).also {
                val name = etName.text.toString()
                val ageText = etAge.text.toString()
                val age = if (ageText.isEmpty()) 18 else ageText.toInt()
                val country = etCountry.text.toString()
                it.putExtra("EXTRA_NAME", name)
                it.putExtra("EXTRA_AGE", age)
                it.putExtra("EXTRA_COUNTRY", country)
                startActivity(it)
            }
        }
    }
}