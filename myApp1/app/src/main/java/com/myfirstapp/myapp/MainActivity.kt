package com.myfirstapp.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatViewInflater
import java.nio.file.attribute.AttributeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
//    fun buttonClicked(view: View){  // Create buttonClicked function in xml file
//        Toast.makeText(this, "Button Clicked...",Toast.LENGTH_LONG).show()
//    }
    fun buttonClicked(view: View){
        var button = view as Button
        when(button.id){
            // "R" is a keyword which store all of the resources which mean all of the components ID
            R.id.button1 -> Toast.makeText(this, "Ah yuon 1",Toast.LENGTH_LONG).show()
            R.id.button2 -> Toast.makeText(this, "Ah yuon 2",Toast.LENGTH_LONG).show()
        }
    }
}