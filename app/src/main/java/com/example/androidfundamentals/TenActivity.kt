package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ten.*

class TenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ten)

        btnAdd.setOnClickListener() {
            val text1 = etFirstNumber.text.toString()
            val firstNumber = if (text1.isEmpty()) 0 else text1.toInt()
            val text2 = etSecondNumber.text.toString()
            val secondNumber = if (text2.isEmpty()) 0 else text2.toInt()
            val result = "Result: ${firstNumber + secondNumber}"
            tvResult.text = result
        }
    }
}