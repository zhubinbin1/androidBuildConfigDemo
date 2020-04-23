package com.opay.buildconfig

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

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

    fun goFourth(view: View) {
        val intent = Intent(this, FourthActivity::class.java)
        startActivity(intent)
    }


    var firstTime = 0L
    override fun onBackPressed() {
        if ((System.currentTimeMillis() - firstTime) > 2000) {
            Toast.makeText(this, "再按一次退出", Toast.LENGTH_LONG).show()
            firstTime = System.currentTimeMillis()
            return
        }
        super.onBackPressed()

    }

}
