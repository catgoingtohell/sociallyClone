package com.example.sociallyclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LoginPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        supportActionBar?.hide()
    }
}