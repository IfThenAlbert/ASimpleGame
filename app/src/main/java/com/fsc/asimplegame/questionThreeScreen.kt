package com.fsc.asimplegame

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AlertDialog

class questionThreeScreen : AppCompatActivity() {
    var selectedANswer: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three_screen)
    }

    fun onChoiceSelectTap(v: View) {
        var r: RadioButton = findViewById(v.id)
        selectedANswer = r.text.toString()
    }

    fun onNextTap(v: View) {
        val dialogBuilder = AlertDialog.Builder(this)

        // set message of alert dialog
        dialogBuilder.setMessage("You sure about that?")
            // if the dialog is cancelable
            .setCancelable(false)
            // positive button text and action
            .setPositiveButton("Proceed", DialogInterface.OnClickListener {
                    dialog, id -> finish()
                val sharedPref = this?.getSharedPreferences("theq",Context.MODE_PRIVATE)
                with (sharedPref.edit()) {
                    putString("answer3", selectedANswer)
                    apply()
                }

                startActivity(Intent(applicationContext,questionFourScreen::class.java))
            })
            // negative button text and action
            .setNegativeButton("Cancel", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })

        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle("The question is ...")
        // show alert dialog
        alert.show()
    }

    override fun onBackPressed() {

    }
}