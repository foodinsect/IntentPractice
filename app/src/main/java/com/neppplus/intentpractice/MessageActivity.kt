package com.neppplus.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.intentpractice.databinding.ActivityMessageBinding
import android.content.Intent // 추가
class MessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMessageBinding // 추가
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessageBinding.inflate(layoutInflater) // 추가
        setContentView(binding.root)

        // 이 화면에 들어올 때 첨부된 데이터를 텍스트뷰에 반영.

        val intentMessage = intent.getStringExtra("message")
        binding.receivedMessageTxt.text = intentMessage

    }
}