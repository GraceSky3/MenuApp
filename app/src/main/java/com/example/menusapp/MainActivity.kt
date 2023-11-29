package com.example.menusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.menusapp.databinding.ActivityMainBinding

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.actionBar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.action_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when(item.itemId){
            R.id.option1 -> {
                Toast
                    .makeText(this, "Opcion 1 ejecutada", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.option2 ->{
                Toast
                    .makeText(this, "Opcion 2 ejecutada", Toast.LENGTH_SHORT).show()
                true
            }else->{
                super.onOptionsItemSelected(item)
            }

        }//fin del when


    }



}