package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android .widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    Button btn7 = findViewById(R.id.button7)
}