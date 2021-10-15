package com.example.calculate

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    fun toastHello(view: View){
//        val toast = Toast.makeText(
//            this,
//            R.string.btn_welcome,
//            Toast.LENGTH_SHORT
//        )
//        toast.show()
//    }
    fun stepOnHelloPage(view: View){
        val res = Intent(this,HelloActivity::class.java)
        startActivity(res)

    }

    fun toastCalcPol(view: View){
//        val toast = Toast.makeText(
//            this,
//            R.string.btn_calculate_pol,
//            Toast.LENGTH_SHORT)
//        toast.show()
        val res = Intent(this,SecondActivity::class.java)
        startActivity(res)
    }

    @SuppressLint("ShowToast")
    fun toastCalcSPol(view: View){
        val toast = Toast.makeText(
            this,
            R.string.btn_calculate_spol,
            Toast.LENGTH_SHORT
        )
        toast.show()
    }

    @SuppressLint("ShowToast")
    fun toastCalcStd(view: View) {
        val toast = Toast.makeText(
            this,
            R.string.btn_calculate_std,
            Toast.LENGTH_SHORT
        )
        toast.show()
    }

    @SuppressLint("ShowToast")
    fun toastSnakeGame(view: View){
        val toast = Toast.makeText(
            this,
            R.string.btn_snake,
            Toast.LENGTH_SHORT
        )
        toast.show()
    }
}