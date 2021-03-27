package com.neppplus.lifecycle_20210327

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인화면", "만들어지는 상황 - onCreate")

        moveBtn.setOnClickListener {

            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }
    }
}