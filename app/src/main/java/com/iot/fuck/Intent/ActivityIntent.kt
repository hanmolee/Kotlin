package com.iot.fuck.Intent

import android.app.Activity
import android.content.Intent
import com.iot.fuck.Page.Page

/**
 * Created by User on 2017-05-31.
 */




inline fun Activity.go(page: Page, f: (intent: Intent) -> Intent)
        = startActivity(f(page.intent(applicationContext)))

fun Activity.go(page: Page) = startActivity(page.intent(applicationContext))
