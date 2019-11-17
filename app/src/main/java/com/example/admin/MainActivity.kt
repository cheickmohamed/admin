package com.example.admin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myButton.setOnClickListener{
            Toast.makeText(this, editText.text, Toast.LENGTH_LONG +10).show()
           // Toast.makeText(this,editText2.text, Toast.LENGTH_LONG)
        }
    }







}
