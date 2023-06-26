package com.neppplus.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.intentpractice.databinding.ActivityMainBinding // 추가
import android.content.Intent // 추가

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // 추가
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 추가
        setContentView(binding.root)

        binding.moveToOtherBtn.setOnClickListener {
            // 다른 화면으로 이동
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }
    }
}