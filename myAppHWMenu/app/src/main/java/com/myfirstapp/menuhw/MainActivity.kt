package com.myfirstapp.menuhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) 
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.food_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.option1 -> {
                var i = Intent(this, DrumpStick::class.java)
                startActivity(i)
            }
            R.id.option2 -> {
                var i = Intent(this, Boneless::class.java)
                startActivity(i)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
