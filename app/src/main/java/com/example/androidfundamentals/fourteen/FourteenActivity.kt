package com.example.androidfundamentals.fourteen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamentals.R
import kotlinx.android.synthetic.main.activity_fourteen.*

class FourteenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourteen)

        btnNext.setOnClickListener {
            Intent(this, Fourteen2Activity::class.java).also {
                startActivity(it)
            }
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}