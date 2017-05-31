package com.iot.fuck

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_kotlin__recycler_view.*

class Kotlin_RecyclerView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin__recycler_view)

        with(recycler_view) {//with 란??  포함하다??
            layoutManager = LinearLayoutManager(this@Kotlin_RecyclerView)
            adapter = FeedAdapter()

        }
    }
}
