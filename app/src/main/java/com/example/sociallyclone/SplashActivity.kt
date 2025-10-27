package com.example.sociallyclone

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Delay for 2 seconds (adjust as needed)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}