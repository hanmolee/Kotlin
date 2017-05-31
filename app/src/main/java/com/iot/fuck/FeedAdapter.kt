package com.iot.fuck

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_list.view.*
import kotlinx.android.synthetic.main.item_text.view.*

/**
 * Created by User on 2017-05-31.
 */

class FeedAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val VIEW_TYPE_PHOTO = 10
    val VIEW_TYPE_TEXT = 20


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        //when식은 C의 switch 연산자와 비슷하다
        when (viewType) {
            VIEW_TYPE_PHOTO -> return PhotoHolder(parent)
            VIEW_TYPE_TEXT -> return TextHolder(parent)
        //viewtype이 사진이라면 사진 홀더를 리턴
        //텍스트라면 텍스트 홀더를 리턴
        }

        throw IllegalArgumentException("Unknown view type : $viewType")
        //throw 는 메소드 내부에서 예외처리를 던지는 것
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {

        when (holder) {//is로 특정 타입의 값인지 검사 가능

            is PhotoHolder -> holder.bindView("작가  $position", "설명  $position")
        //hloder가 Photoholder클래스 타입이라면 holder의 메서드인 bindView에 접근
            is TextHolder -> holder.bindView("작가  $position",   "설명  $position")
            //hloder가 Textholder클래스 타입이라면 holder의 메서드인 bindView에 접근
        }

    }

    override fun getItemViewType(position: Int): Int {
        return if (position % 2 == 0) VIEW_TYPE_PHOTO else VIEW_TYPE_TEXT
        //ItemViewtype이 짝수면 포토를 홀수면 텍스트를 리턴
    }

    override fun getItemCount(): Int {

        return 20
    }


    inner class TextHolder(parent: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.
            from(parent.context).inflate(R.layout.item_list, parent, false)) {

        fun bindView(author: String, description: String){
            with(itemView){
                text_author.text = author
                text_description.text = description
            }

        }


    }


    inner class PhotoHolder(parent: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.
            from(parent.context).inflate(R.layout.item_list, parent, false)) {

        fun bindView(author: String, description: String) {
            with(itemView) {
                item_photo.setImageResource(R.drawable.kotlin)
                photo_author.text = author
                photo_description.text = description

            }

        }

    }
}