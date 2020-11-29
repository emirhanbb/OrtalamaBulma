package com.uygulama.ortalamabulma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button = findViewById(R.id.button)



        button.setOnClickListener{

            val sonuc1= findViewById<TextView>(R.id.sonuc)

            var sayi1int = sayi1.text.toString().toInt()
            var sayi2int = sayi2.text.toString().toInt()
            sonuc1.text = ((sayi1int + sayi2int)/2).toString()
        }



    }





}

