package com.neppplus.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.intentpractice.databinding.ActivityMainBinding // 추가
import android.content.Intent // 추가

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // 추가

    val REQUSET_FOR_NICKNAME = 1005
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 추가
        setContentView(binding.root)


        binding.editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this,EditNicknameActivity::class.java)
            startActivityForResult(myIntent, REQUSET_FOR_NICKNAME)
        }




        binding.moveToOtherBtn.setOnClickListener {
            // 다른 화면으로 이동
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)
        }

        binding.sendMessageBtn.setOnClickListener {
            // 데이터를 보내는 액티비티
            val inputMessage = binding.messageEdt.text.toString()
            val myIntent = Intent(this, MessageActivity::class.java)
            myIntent.putExtra("message", inputMessage)
            startActivity(myIntent)
        }




    }
}