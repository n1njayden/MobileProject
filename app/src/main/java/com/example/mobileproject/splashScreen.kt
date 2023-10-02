package com.example.mobileproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var iv: ImageView = findViewById(R.id.logo)
        iv.alpha = 0f
        iv.animate().setDuration(5000).alpha(1f).withEndAction{
            val i = Intent(this, loginScreen::class.java)
            startActivity(i);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}