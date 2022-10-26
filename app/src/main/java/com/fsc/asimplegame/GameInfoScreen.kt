package com.fsc.asimplegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GameInfoScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_info_screen)
    }

    fun btnLetThePartyStarted(v:View) {
        startActivity(Intent(applicationContext,questionOneScreen::class.java))
    }
}