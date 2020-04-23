package com.opay.buildconfig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goSecond(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun goThird(view: View) {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

}
