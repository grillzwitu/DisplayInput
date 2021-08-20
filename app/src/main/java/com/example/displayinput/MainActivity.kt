package com.example.displayinput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var user_Input: EditText
    private lateinit var enterInput: Button
    private lateinit var inputDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runApp()
    }

    private fun runApp() {
        user_Input = findViewById(R.id.userInput)
        enterInput = findViewById(R.id.enterBtn)
        inputDisplay = findViewById(R.id.inputDisplay)

        enterInput.setOnClickListener {
            inputDisplay.text = user_Input.text
            user_Input.text.clear()
        }
    }
}