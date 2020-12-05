package com.example.androidfundamentals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFiveLesson.setOnClickListener {
            Intent(this, FiveActivity::class.java).also {
                startActivity(it)
            }
        }

        btnSevenLesson.setOnClickListener {
            Intent(this, SevenActivity::class.java).also {
                startActivity(it)
            }
        }

        btnNineLesson.setOnClickListener {
            Intent(this, NineActivity::class.java).also {
                startActivity(it)
            }
        }

        btnTenLesson.setOnClickListener {
            Intent(this, TenActivity::class.java).also {
                startActivity(it)
            }
        }

        btnElevenLesson.setOnClickListener {
            Intent(this, ElevenActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}