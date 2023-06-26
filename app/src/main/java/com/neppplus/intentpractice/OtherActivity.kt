package com.neppplus.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.intentpractice.databinding.ActivityOtherBinding // 수정: ActivityMainBinding -> ActivityOtherBinding

class OtherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOtherBinding // 수정: ActivityMainBinding -> ActivityOtherBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtherBinding.inflate(layoutInflater) // 수정: ActivityMainBinding -> ActivityOtherBinding
        setContentView(binding.root)

        binding.returnToMain.setOnClickListener {
//            val myIntent = Intent (this, MainActivity::class.java)
//            startActivity(myIntent)
            finish()

        }
    }
}
