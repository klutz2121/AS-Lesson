package com.myfirstapp.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun share(v:View){
        var i = Intent()
        i.action = Intent.ACTION_SEND
        var message = msg.text.toString()
        i.putExtra(Intent.EXTRA_TEXT, message)
        i.type = "text/plain"
        startActivity(Intent.createChooser(i, "Send to"))
    }
}
