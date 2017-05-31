
package com.iot.fuck.Page

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.res.Resources
import com.iot.fuck.Kotlin_RecyclerView
import com.iot.fuck.MainActivity
import com.iot.fuck.R

/**
 * Created by User on 2017-05-31.
 */

enum class Page(val nameId: Int, val page: Class<out Activity>) {
    MAIN(R.string.page_main, MainActivity::class.java) {
        override fun intent(context: Context): Intent = super.intent(context).
                apply { addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) }
    },
    SECOND(R.string.page_second, Kotlin_RecyclerView::class.java);


    open fun intent(context: Context) = Intent(context, page)
    fun name(resources: Resources) = resources.getString(nameId)

}