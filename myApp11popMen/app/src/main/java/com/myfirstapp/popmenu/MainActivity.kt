package com.myfirstapp.popmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerForContextMenu(view)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.fried -> {
                Toast.makeText(this, "Fried Chicken selected",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.hotdog -> {
                Toast.makeText(this, "CircleK Hot Dog selected",Toast.LENGTH_LONG).show()
                return true
            }
            R.id.pasta -> {
                Toast.makeText(this, "Original Italian Pasta selected",Toast.LENGTH_LONG).show()
                return true
            }
            else -> {
                return false
            }
        }
        return super.onContextItemSelected(item)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.popmen, menu)
    }
}
