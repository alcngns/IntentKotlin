package com.alicangunes.intentkotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.alicangunes.intentkotlin.databinding.ActivityNextBinding


class NextActivity : AppCompatActivity() {

    private lateinit var binding : ActivityNextBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val intentFromMain = intent //getIntent()
        val name = intentFromMain.getStringExtra("name")
        binding.nameText.text = "Name : ${name}"

    }

    fun previous(view : View) {
        val intent = Intent(this@NextActivity, MainActivity::class.java)
        startActivity(intent)
    }
}