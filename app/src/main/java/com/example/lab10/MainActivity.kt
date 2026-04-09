package com.example.lab10

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lab10.databinding.ActivityMainBinding
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import kotlin.properties.Delegates.notNull
class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding

        private var g by notNull<Boolean>()
        var kr  = false
        var sob = false
        var cot = false
        var ptic = false
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

            if (savedInstanceState == null){
                g = false
            }else{
                g = savedInstanceState.getBoolean(KEY_IS_VISIBLE)
            }

            binding.zpshka.setOnClickListener {
                if(binding.zpshka.isChecked){g = false
                    render()}
            }
            binding.volonter.setOnClickListener {
                if (binding.volonter.isChecked) {g = true
                render()}
            }


            binding.sob.setOnClickListener {
                if (binding.sob.isChecked){
                    sob = true
                }
            }

            binding.kosh.setOnClickListener {
                if (binding.kosh.isChecked){
                    cot = true
                }
            }

            binding.krol.setOnClickListener {
                if (binding.krol.isChecked){
                    kr = true
                }
            }

            binding.ptic.setOnClickListener {
                if (binding.ptic.isChecked){
                    ptic = true
                }
            }

            if (ptic == true){
                binding.ptic.isChecked
            }

            if (cot == true){
                binding.kosh.isChecked
            }

            if (sob == true){
                binding.sob.isChecked
            }

            if (kr == true){
                binding.krol.isChecked
            }
        }

    private fun render() = with(binding){
        hochet.visibility = if (g) View.VISIBLE else View.INVISIBLE
    }

        override fun onSaveInstanceState(outState: Bundle) {
            super.onSaveInstanceState(outState)
            outState.putBoolean(KEY_IS_VISIBLE,g)
        }

    companion object{
        @JvmStatic private val KEY_IS_VISIBLE = "IS_VISIBLE"
    }
    }


