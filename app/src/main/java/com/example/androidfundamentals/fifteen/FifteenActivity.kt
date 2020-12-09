package com.example.androidfundamentals.fifteen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamentals.R
import kotlinx.android.synthetic.main.activity_fifteen.*

class FifteenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifteen)

        btnApply.setOnClickListener {
            Intent(this, Fifteen2Activity::class.java).also {
                val nameSeparate = etNameSeparate.text.toString()
                val ageTextSeparate = etAgeSeparate.text.toString()
                val ageSeparate = if (ageTextSeparate.isEmpty()) 18 else ageTextSeparate.toInt()
                val countrySeparate = etCountrySeparate.text.toString()
                it.putExtra("EXTRA_NAME", nameSeparate)
                it.putExtra("EXTRA_AGE", ageSeparate)
                it.putExtra("EXTRA_COUNTRY", countrySeparate)

                val nameClass = etNameClass.text.toString()
                val ageTextClass = etAgeClass.text.toString()
                val ageClass = if (ageTextClass.isEmpty()) 18 else ageTextClass.toInt()
                val countryClass = etCountryClass.text.toString()
                val person = Person(
                    nameClass,
                    ageClass,
                    countryClass
                )
                it.putExtra("EXTRA_PERSON", person)

                startActivity(it)
            }
        }
    }
}