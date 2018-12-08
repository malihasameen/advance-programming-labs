package com.example.dell.bmicalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calculate(view: View) {
        val height = java.lang.Float.parseFloat(input_height.text.toString().trim { it <= ' ' })
        val weight = java.lang.Float.parseFloat(input_weight.text.toString().trim { it <= ' ' })
        val bmi = weight / (height * height)
        result_text_view.text = "Your BMI is: " + bmi.toString()
    }
}
