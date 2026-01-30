package com.example.spalshactivity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Finding the button with the ID you set in XML
        val loginBtn = findViewById<Button>(R.id.button)

        loginBtn.setOnClickListener {
            // This moves the app to the Dashboard screen
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent)
        }
    }
}