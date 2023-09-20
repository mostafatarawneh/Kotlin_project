package com.mostafa.interntdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecendActivity : AppCompatActivity() {
    lateinit var tv : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secend)

        tv = findViewById(R.id.textView2)
        val email =intent.getStringExtra("user")
        val password = intent.getStringExtra("password")
        tv.setText("hello this is your Email : $email and your password is $password")

    }
}