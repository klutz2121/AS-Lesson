package com.myfirstapp.myapp5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // Activity life cycle is the start point of the activity till the end
    // life cycle event is the event which happened during the activity life cycle
    // Call back is the method
    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(MainActivity(),"Hello World",Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(MainActivity(),"Hello yuon",Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(MainActivity(),"Hello ah yuon",Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(MainActivity(),"Hello Ah Nguyen",Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(MainActivity(),"Hello mate",Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(MainActivity(),"Hello Vietnamese",Toast.LENGTH_LONG).show()
    }
}