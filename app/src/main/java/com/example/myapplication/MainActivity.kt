package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .add(R.id.container,BlankFragment())
            .commit()
        binding.toHome.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container,BlankFragment())
                .commit()
    }
        binding.toProfile.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container,ProfileFragment())
                .commit()
        }
    }
}