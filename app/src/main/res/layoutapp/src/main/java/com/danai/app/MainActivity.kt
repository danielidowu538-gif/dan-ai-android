package com.danai.app

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val messageInput = findViewById<EditText>(R.id.messageInput)
        val sendButton = findViewById<Button>(R.id.sendButton)
        val responseText = findViewById<TextView>(R.id.responseText)

        sendButton.setOnClickListener {
            val message = messageInput.text.toString().trim()

            if (message.isNotEmpty()) {
                responseText.text = "You: $message\n\nDan AI: I'm receiving your message..."
                messageInput.text.clear()
            }
        }
    }
}
