package com.example.androidfundamentals.seven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidfundamentals.R
import kotlinx.android.synthetic.main.activity_seven.*

class SevenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        btnApply.setOnClickListener {
            val firstName = etFirstName.text.toString()
            val lastName = etLastName.text.toString()
            val birthDate = etBirthDate.text.toString()
            val country = etCountryClass.text.toString()
            val info = "$firstName $lastName was born in $birthDate and lives in $country"
            tvInfo.text = info
        }
    }
}