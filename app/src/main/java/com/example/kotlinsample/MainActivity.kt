package com.example.kotlinsample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //레이아웃에 button ID - 이벤트 리스너 등록
        button1.setOnClickListener {
            //버튼 클릭 시 코드 작성
            startActivity(Intent(this@MainActivity,BmijavaActivity::class.java))
        }

        //레이아웃에 button ID - 이벤트 리스너 등록
        button2.setOnClickListener {
            //버튼 클릭 시 코드 작성
            startActivity(Intent(this@MainActivity,BmiKotlinActivity::class.java))

        }

        button3.setOnClickListener {
            startActivity(Intent(this@MainActivity,VariableJavaActivity::class.java))
        }

        button4.setOnClickListener {
            startActivity(Intent(this@MainActivity,VariableKotlinActivity::class.java))
        }

    }
}