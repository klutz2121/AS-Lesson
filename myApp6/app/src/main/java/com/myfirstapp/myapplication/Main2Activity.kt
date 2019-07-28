package com.myfirstapp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /*var name = intent.getStringExtra("user_name")
        var sch = intent.getStringExtra("school")
        user.text = "Welcome to $name"*/

        var bundle = intent.extras
        var name = bundle?.get("user_name")
        var school = bundle?.get("KIT")

        user.text = "Name is $name and school is $school"
    }
}
