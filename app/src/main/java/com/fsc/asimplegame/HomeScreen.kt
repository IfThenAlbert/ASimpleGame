package com.fsc.asimplegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)


    }

    fun onLogInTap(v: View) {
        startActivity(Intent(applicationContext,LogInScreen::class.java))
    }

    fun onRegisterTap(v: View) {
        startActivity(Intent(applicationContext,RegisterScreen::class.java))
    }

    override fun onBackPressed() {

    }
}
