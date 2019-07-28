package com.myfirstapp.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun startNew(v: View){
        var intent = Intent(this, Main2Activity::class.java)
        var name = editText.toString()
        /*intent.putExtra("user_name",name)
        intent.putExtra("School","KIT")*/

        var bundle = Bundle()

        bundle.putString("user_name",name)
        bundle.putString("school","KIT")
        startActivity(intent)
    }
}
