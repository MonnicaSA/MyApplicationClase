package com.example.myapplicationclase

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ContactActivity : AppCompatActivity() {
    private lateinit var binding: Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}