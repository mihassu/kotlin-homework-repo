package com.kotlin.lesson01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textView = findViewById<TextView>(R.id.greetingTV)
        val button = findViewById<Button>(R.id.greetingButton)
        button.setOnClickListener {
            textView.setText(R.string.greetingText)
        }
    }


}


