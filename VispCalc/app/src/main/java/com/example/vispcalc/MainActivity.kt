package com.example.vispcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.math.RoundingMode
import java.text.DecimalFormat

lateinit var btn : Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         btn = findViewById(R.id.button)

    }

   fun convert(view: View){

       var inputField = findViewById<EditText>(R.id.inputVal)
       var input = inputField.text
       var convertedVal = (input.toString().toFloat() * 72.97)
       val df = DecimalFormat("#.###")
       df.roundingMode = RoundingMode.CEILING
       var ans =  df.format(convertedVal)
       var output = findViewById<TextView>(R.id.outputVal).setText(ans.toString())

   }
}