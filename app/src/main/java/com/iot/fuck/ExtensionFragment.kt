package com.iot.fuck

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_extension_fragment.*

class ExtensionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.activity_extension_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {//이때부터 extension을 통해 뷰 객체에 접근가능

        button.setOnClickListener {
            textView.text = "hello Fragment, ${editTect.text.toString()}"


        }
    }
}
