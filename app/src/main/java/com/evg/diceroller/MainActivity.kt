package com.evg.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)

        /*val resultText: TextView = findViewById(R.id.result_text)
        rollButton.setOnClickListener {
            val randomInt = (1..6).random()
            resultText.text = randomInt.toString()
        }*/

        rollButton.setOnClickListener {
            val drawableResource = when ((1..6).random()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableResource)
        }
        diceImage = this.findViewById(R.id.dice_image)
    }
}