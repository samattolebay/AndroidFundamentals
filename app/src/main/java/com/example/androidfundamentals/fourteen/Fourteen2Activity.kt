package com.example.androidfundamentals.fourteen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamentals.R
import kotlinx.android.synthetic.main.activity_fourteen2.*

class Fourteen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourteen2)

        btnBack.setOnClickListener {
            finish()
        }
    }
}