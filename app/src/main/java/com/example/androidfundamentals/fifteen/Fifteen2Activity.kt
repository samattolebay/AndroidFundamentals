package com.example.androidfundamentals.fifteen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamentals.R
import kotlinx.android.synthetic.main.activity_fifteen2.*

class Fifteen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifteen2)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 18)
        val country = intent.getStringExtra("EXTRA_COUNTRY")
        val text = "$name is $age years old living in $country"
        tvInfoSeparate.text = text

        val person = intent.getSerializableExtra("EXTRA_PERSON")
        tvInfoPerson.text = person.toString()

        btnBack.setOnClickListener {
            finish()
        }
    }
}