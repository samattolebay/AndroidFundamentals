package com.example.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_twelve.*

class TwelveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twelve)

        btnOrder.setOnClickListener {
            val checkedMeetID = rgMeet.checkedRadioButtonId
            val meet = findViewById<RadioButton>(checkedMeetID)
            val isCheeseChecked = cbCheese.isChecked
            val isOnionsChecked = cbOnions.isChecked
            val isSaladChecked = cbSalad.isChecked

            val text = "You ordered a burger with:" +
                    "\n${meet.text}" + (if (meet == rbPork) " (it's haram though)" else "") +
                    (if (isCheeseChecked) "\n${cbCheese.text}" else "") +
                    (if (isOnionsChecked) "\n${cbOnions.text}" else "") +
                    (if (isSaladChecked) "\n${cbSalad.text}" else "")

            tvOrder.text = text
        }
    }
}