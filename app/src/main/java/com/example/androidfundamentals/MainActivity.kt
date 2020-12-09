package com.example.androidfundamentals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamentals.eleven.ElevenActivity
import com.example.androidfundamentals.fifteen.FifteenActivity
import com.example.androidfundamentals.five.FiveActivity
import com.example.androidfundamentals.fourteen.FourteenActivity
import com.example.androidfundamentals.nine.NineActivity
import com.example.androidfundamentals.seven.SevenActivity
import com.example.androidfundamentals.ten.TenActivity
import com.example.androidfundamentals.thirteen.ThirteenActivity
import com.example.androidfundamentals.twelve.TwelveActivity
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

        btnTwelveLesson.setOnClickListener {
            Intent(this, TwelveActivity::class.java).also {
                startActivity(it)
            }
        }

        btnThirteenLesson.setOnClickListener {
            Intent(this, ThirteenActivity::class.java).also {
                startActivity(it)
            }
        }

        btnFourteenLesson.setOnClickListener {
            Intent(this, FourteenActivity::class.java).also {
                startActivity(it)
            }
        }

        btnFifteenLesson.setOnClickListener {
            Intent(this, FifteenActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}