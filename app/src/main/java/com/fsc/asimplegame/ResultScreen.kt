package com.fsc.asimplegame

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class ResultScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)

        val sharedPref = this?.getSharedPreferences("theq",Context.MODE_PRIVATE) ?: return
        val a1:String = sharedPref.getString("answer1", "00").toString()
        val a2:String = sharedPref.getString("answer2", "00").toString()
        val a3:String = sharedPref.getString("answer3", "00").toString()
        val a4:String = sharedPref.getString("answer4", "00").toString()
        val a5:String = sharedPref.getString("answer5", "00").toString()
        var resultInfo:String = "YOU GOT .. ."


        if(a1.toLowerCase().equals("albert")) {
            resultInfo += "\nQUESTION 1 CORRECT"
        }else{
            resultInfo += "\nQUESTION 1 WRONG"
        };
        resultInfo += "\n"

        if(a2.toLowerCase().equals("blue")) {
            resultInfo += "\nQUESTION 2 CORRECT"
        }else{
            resultInfo += "\nQUESTION 2 WRONG"
        }
        resultInfo += "\n"

        if(a3.toLowerCase().equals("casper")) {
            resultInfo += "\nQUESTION 3 CORRECT"
        }else{
            resultInfo += "\nQUESTION 3 WRONG"
        }
        resultInfo += "\n"

        if(a4.toLowerCase().equals("java")) {
            resultInfo += "\nQUESTION 4 CORRECT"
        }else{
            resultInfo += "\nQUESTION 4 WRONG"
        }
        resultInfo += "\n"

        if(a5.toLowerCase().equals("android")) {
            resultInfo += "\nQUESTION 5 CORRECT"
        }else{
            resultInfo += "\nQUESTION 5 WRONG"
        }


        var resultTxt:TextView ?= findViewById(R.id.txtrr)

        resultTxt?.setText(resultInfo)
    }

    override fun onBackPressed() {

    }
}