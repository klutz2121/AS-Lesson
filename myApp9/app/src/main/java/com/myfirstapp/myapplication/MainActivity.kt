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
    fun call2(v:View){
        var intent =Intent(this, Main2Activity::class.java)
        var num1 = editText.text.toString()
        var num2 = editText2.text.toString()

        intent.putExtra("num1",num1)
        intent.putExtra("num2",num2)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == 10 && requestCode == 1){
            var res = data?.getStringExtra("Result")
            textView3.text = res
        }
    }
}
