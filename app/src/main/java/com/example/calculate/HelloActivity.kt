package com.example.calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HelloActivity : AppCompatActivity() {
    companion object{
        const val TOTAL_KEY = "hello"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
    }
}