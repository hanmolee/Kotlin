package com.iot.fuck

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.iot.fuck.Intent.go
import com.iot.fuck.Page.Page
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_activity_extension.text = getString(R.string.go, Page.SECOND.name(resources))

        btn_activity_extension.setOnClickListener {

            tv_activity_extension_hello.text =
                    "Hello, ${et_activity_extension_name.text.toString()}"

            go(Page.SECOND) {
                it.putExtra("hoge", "hoge")
            }
        }


    }
}
