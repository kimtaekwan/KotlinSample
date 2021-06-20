package com.example.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_valiable.*
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {

    var clickCount =0

    val startTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_valiable)
        //시작 시간 텍스트로 변환
        val timetext = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        //시작 시간 -> 텍스트뷰
        startTimeLabel.text = "Activity시작시간 : ${timetext}"
        //클릭 횟수 -> 텍스트뷰
        clickCountLabel.text = "버튼이 클릭된 횟수: ${clickCount}"

        button.setOnClickListener {
            clickCount = clickCount+1
            clickCountLabel.text = "버튼이 클릭 된 횟수 ${clickCount}"
        }
    }
}