package com.neppplus.intentpractice

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.intentpractice.databinding.ActivityMainBinding // 추가
import android.content.Intent // 추가
import android.net.Uri

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // 추가

    val REQUSET_FOR_NICKNAME = 1005
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 추가
        setContentView(binding.root)

        // 문자 전송 예제
        binding.smsBtn.setOnClickListener {
            val inputPhoneNum = binding.phoneNumEdt.text.toString()
            val myUri = Uri.parse("smsto:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_SENDTO, myUri)
            myIntent.putExtra("sms_body","미리 내용 입력")
            startActivity(myIntent)
        }


        // CALL 액션 예제
        binding.callBtn.setOnClickListener {
            val inputPhoneNum = binding.phoneNumEdt.text.toString()
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)
        }

        // DIAL 액션 예제
        binding.dialBtn.setOnClickListener {
            val inputPhoneNum = binding.phoneNumEdt.text.toString()
            val myUri = Uri.parse("tel:${inputPhoneNum}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }


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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // 돌아온 이유가 닉네임을 받으러 다녀온게 맞는지?
        if (requestCode == REQUSET_FOR_NICKNAME){

            if(resultCode == Activity.RESULT_OK){

                val newNickname = data?.getStringExtra("nickname")
                binding.nicknameTxt.text = newNickname
            }
        }
    }
}