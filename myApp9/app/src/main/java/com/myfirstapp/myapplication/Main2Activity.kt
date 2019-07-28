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
        var n1 = intent.getStringExtra("num1")
        var n2 = intent.getStringExtra("num2")
        textView.text = n1
        textView2.text = n2
    }
    fun add(v:View){
        var i = Intent()
        var n1 = intent.getStringExtra("num1")
        var n2 = intent.getStringExtra("num2")
        var res = n1.toInt() + n2.toInt()
        i.putExtra("Result", res.toString())
        setResult(10, i)
        finish()
    }
    fun minus(v:View){
        var i = Intent()
        var n1 = intent.getStringExtra("num1")
        var n2 = intent.getStringExtra("num2")
        var res = n1.toInt() - n2.toInt()
        i.putExtra("Result", res.toString())
        setResult(10, i)
        finish()
    }
    fun multiple(v:View){
        var i = Intent()
        var n1 = intent.getStringExtra("num1")
        var n2 = intent.getStringExtra("num2")
        var res = n1.toInt() * n2.toInt()
        i.putExtra("Result", res.toString())
        setResult(10, i)
        finish()
    }
    fun divide(v:View){
        var i = Intent()
        var n1 = intent.getStringExtra("num1")
        var n2 = intent.getStringExtra("num2")
        var res = n1.toInt() / n2.toInt()
        i.putExtra("Result", res.toString())
        setResult(10, i)
        finish()
    }
}
