package com.iot.fuck

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_activity_extension.setOnClickListener {

            tv_activity_extension_hello.text =
                    "Hello, ${et_activity_extension_name.text.toString()}"

            val intent = Intent(this, Kotlin_RecyclerView::class.java)
            startActivity(intent)// 인텐트로 화면전환한다
        }
    }
}

