package com.neppplus.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.intentpractice.databinding.ActivityEditNicknameBinding
import android.content.Intent // 추가
import android.app.Activity

class EditNicknameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditNicknameBinding // 추가
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditNicknameBinding.inflate(layoutInflater) // 추가
        setContentView(binding.root)

        binding.okBtn.setOnClickListener {
            // 입력한 새 닉네임이 뭔지? 변수로 저장
            val inputNewNickname = binding.newNicknameEdt.text.toString()

            // 입력한 닉네임을 가지고 메인으로 복귀
            // 입력 닉네임을 담아주기 위한 용도로만 사용하는 Intent
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNewNickname)
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}