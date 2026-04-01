package com.example.lab10

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lab10.databinding.ActivityMainBinding
    class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
            binding.zpshka.setOnClickListener {
                if(binding.zpshka.isChecked){
                    binding.hochet.visibility = View.INVISIBLE
                }
            }
            binding.volonter.setOnClickListener {
                if (binding.volonter.isChecked) {
                    binding.hochet.visibility = View.VISIBLE
                }
            }
        }
    }

