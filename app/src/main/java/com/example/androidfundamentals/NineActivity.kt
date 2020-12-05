package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nine.*

class NineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nine)

        var count = 0

        btnCount.setOnClickListener {
            count++
            val text = "Let's count together: $count"
            tvCount.text = text
        }
    }
}