package com.example.mobilepert7

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)


        val editTextTweet = findViewById<EditText>(R.id.editTextTweet)
        val buttonPost = findViewById<Button>(R.id.buttonPost)

        buttonPost.setOnClickListener {
            val text = editTextTweet.text.toString()
            if (text.isNotBlank()) {
                Toast.makeText(this, "Tweet terkirim: $text", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Tulis sesuatu dulu dong!", Toast.LENGTH_SHORT).show()
            }
        }

        supportActionBar?.title = "Post"
    }
}
