package com.myfirstapp.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.option1 -> {
                Toast.makeText(this,"Pizza Selected", Toast.LENGTH_LONG).show()
                /*var i = Intent(this, Main2Activity::class.java)
                startActivity(i)*/

            }
            R.id.option2 -> {
                Toast.makeText(this, "Fried Chicken selected", Toast.LENGTH_LONG).show()
            }
            R.id.option3 -> {
                Toast.makeText(this,"Hot Dog Selected", Toast.LENGTH_LONG).show()
            }
            R.id.option4 -> {
                Toast.makeText(this, "Kuy Teav selected", Toast.LENGTH_LONG).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
