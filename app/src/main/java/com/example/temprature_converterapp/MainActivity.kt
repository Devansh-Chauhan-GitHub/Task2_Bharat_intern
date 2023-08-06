package com.example.temprature_converterapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun convert_button(view: View)
    {
        val cel=findViewById<TextView>(R.id.editTextText2)
        val textview4: TextView =findViewById<TextView>(R.id.textView4)
        val celsiusstring=cel.editableText.toString()
        val celsius=celsiusstring.toDouble()
        val fahrenheit: Double = (celsius * 9/5) + 32
        try{
            textview4.visibility=View.VISIBLE
            textview4.text= "$fahrenheit\u00B0F"
        }
        catch (e: Exception)
        {
            Log.e("Eror",e.toString())
        }
    }
}
