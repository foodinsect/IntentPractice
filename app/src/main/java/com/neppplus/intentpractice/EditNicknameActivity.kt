package com.neppplus.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.intentpractice.databinding.ActivityEditNicknameBinding

class EditNicknameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditNicknameBinding // 추가
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditNicknameBinding.inflate(layoutInflater) // 추가
        setContentView(binding.root)

    }
}