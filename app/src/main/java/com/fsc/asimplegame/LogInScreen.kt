package com.fsc.asimplegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LogInScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in_screen)

    }

    fun onGoTap(v: View) {
        var usernameField:EditText ?= findViewById(R.id.inp_username)
        var passwordField: EditText?= findViewById(R.id.inp_password)

        if(usernameField != null && passwordField != null) {
            if((usernameField.text.isEmpty() == false) && (passwordField.text.isEmpty() == false) ) {
                startActivity(Intent(applicationContext,GameInfoScreen::class.java))
            }else{
                Toast.makeText(applicationContext,"Incorrect",Toast.LENGTH_SHORT).show()
            };
        };

    }

    fun onBackTap(v:View) {
        startActivity(Intent(applicationContext,HomeScreen::class.java))
    }

    // prevent user from user the device back button
    override fun onBackPressed() {

    }
}