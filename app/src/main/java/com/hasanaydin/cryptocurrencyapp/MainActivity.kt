package com.hasanaydin.cryptocurrencyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hasanaydin.cryptocurrencyapp.databinding.ActivityMainBinding

// API Key : 68fb62f53f85ef132e77234a5d2dc957d7285984
// https://api.nomics.com/v1/prices?key=68fb62f53f85ef132e77234a5d2dc957d7285984

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}