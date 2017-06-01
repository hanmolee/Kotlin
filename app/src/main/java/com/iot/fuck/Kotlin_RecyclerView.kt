package com.iot.fuck

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_kotlin__recycler_view.*

class Kotlin_RecyclerView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin__recycler_view)

        with(recycler_view) {//with 란 하나의 인스턴스에 여러 메소드를 쓰기위한 함수
            layoutManager = LinearLayoutManager(this@Kotlin_RecyclerView)
            adapter = FeedAdapter()
            //with의 예시 = Java의 a.sum, a.max, a.min을
            //              with(a){ sum, max, min } 이런식으로 쓸 수 있다
        }
    }
}
