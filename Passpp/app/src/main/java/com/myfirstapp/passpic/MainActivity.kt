package com.myfirstapp.passpic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toGet(v:View){

    }
    fun goTo(v: View){
        var i = Intent(this, display::class.java)
        i.putExtra("image", R.drawable.pizza)
        startActivity(i)
    }
}
