package com.fsc.asimplegame

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class RegisterScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)



    }

    fun onRegisterDoneTap(v: View) {
        var inpUser:EditText ?= findViewById(R.id.inp_user)
        var inpPass:EditText ?= findViewById(R.id.inp_pass)
        var inpEmail:EditText ?= findViewById(R.id.inp_email)

        if(inpUser?.text.toString().isEmpty() || inpPass?.text.toString().isEmpty() ||
            inpEmail?.text.toString().isEmpty() ) {
            Toast.makeText(applicationContext,"PLEASE FILL OUT THE FORM!",Toast.LENGTH_SHORT).show()
        }else{
            if(inpUser?.text.toString().length >= 2 && inpPass?.text.toString().length >= 2 &&
                inpEmail?.text.toString().length >= 2) {

                if(isValidEmail(inpEmail?.text.toString())) {
                    startActivity(Intent(applicationContext,HomeScreen::class.java))
                };

            };
        }
    }

    // function that checks if the given email is valid
    fun isValidEmail(target: CharSequence?): Boolean {
        return if (TextUtils.isEmpty(target)) {
            false
        } else {
            Patterns.EMAIL_ADDRESS.matcher(target).matches()
        }
    }
}