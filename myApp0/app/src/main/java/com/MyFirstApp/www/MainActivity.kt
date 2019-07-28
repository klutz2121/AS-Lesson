package com.MyFirstApp.www

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { // Override from the parent class
        super.onCreate(savedInstanceState)
        // setContentView : is a built in func and it connect the XML file and KOTLIN file
        setContentView(R.layout.activity_main)// Execution start from this
        // Taking input and view the input
        /*button.setOnClickListener{
            var ed = editText2.text.toString()
            textView.text = ed*/

        /*calc.setOnClickListener{
            var year = editText.text.toString().toInt()
            // Singleton : getting only one time obj access
            var c_year = Calendar.getInstance().get(Calendar.YEAR)
            // Calendar is almost like a built in obj where we can call and use
            var age = c_year - year
            textView.text = "Your age is : $age"*/

        calc.setOnClickListener {
            var resd:Int
            var resm:Int
            var resy:Int
            var dob = editText.text.toString()
            var arr = dob.split("/")
            var day1:Int = arr[0].toInt()
            var month1:Int = arr[1].toInt()
            var year1:Int = arr[2].toInt()
            var day:Int = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
            var month:Int = Calendar.getInstance().get(Calendar.MONTH)
            var year:Int = Calendar.getInstance().get(Calendar.YEAR)
            resy = year - year1
            resm = month - month1 + 1
            if (resm<0){
                resy -= 1
                resm += 12
            }
            resd =  day -day1
            if (resd < 0 ){
                resm -= 1
                resd += 30
            }
            textView.text = "Your age is : $resy years $resm months $resd days"
        }
    }
}
