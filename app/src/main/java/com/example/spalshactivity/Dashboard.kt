package com.example.spalshactivity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Find the profile icon in your bottom navigation
        val profileNav = findViewById<ImageView>(R.id.btnNavProfile)

        profileNav.setOnClickListener {
            // This takes the user back to the Login screen
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // This closes the Dashboard
        }
    }
}