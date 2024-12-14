package com.alicangunes.intentkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.alicangunes.intentkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        println("onCreate executed!")
    }

    fun next(view : View) {

        val intent = Intent(this@MainActivity, NextActivity::class.java)
        intent.putExtra("name", binding.editText.text.toString())
        startActivity(intent)
        finish()
    }

    override fun onStart() {
        super.onStart()
        println("onStart executed!")
        binding.editText.setText("")
    }

    override fun onResume() {
        super.onResume()
        println("onResume executed!")
    }

    override fun onPause() {
        super.onPause()
        println("onPause executed!")
    }

    override fun onStop() {
        super.onStop()
        println("onStop executed!")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy executed!")
    }
}