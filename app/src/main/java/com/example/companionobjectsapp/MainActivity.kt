package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var myText: EditText
    lateinit var myButton: Button
    lateinit var mainLayout: ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // UI
        myText = findViewById(R.id.textField)
        myButton = findViewById(R.id.changeBackgroundButton)
        mainLayout = findViewById(R.id.mainLayout)


        myButton.setOnClickListener {
            var input = myText.text.toString()
            val newInput = imageDisplayer.check(input)

            if (newInput == "day") {
                //change background
                mainLayout.setBackgroundResource(R.drawable.morning)

            } else if (newInput == "night") {
                mainLayout.setBackgroundResource(R.drawable.night)

            } else if (newInput == "invalid") {
                Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show()
            }
        }
    }
}