package com.example.androidfundamentals.thirteen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidfundamentals.R
import kotlinx.android.synthetic.main.activity_thirteen.*
import kotlinx.android.synthetic.main.custom_toast.*

class ThirteenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirteen)

        btnDefaultToast.setOnClickListener {
            Toast.makeText(this, "This is a default toast!", Toast.LENGTH_SHORT).show()
        }

        btnCustomToast.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_SHORT
                view = layoutInflater.inflate(R.layout.custom_toast, clToast)
                show()
            }
        }
    }
}