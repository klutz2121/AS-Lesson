package com.myfirstapp.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun goHome(v:View){
        var i = Intent()
        var username = editText.text.toString()

        i.putExtra("Data", username)
        setResult(10, i)
        finish()
    }
}
