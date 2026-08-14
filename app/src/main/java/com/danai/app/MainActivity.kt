package com.danai.app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this)
        text.text = "Welcome to Dan AI"
        text.textSize = 24f
        text.setPadding(40, 80, 40, 40)

        setContentView(text)
    }
}
