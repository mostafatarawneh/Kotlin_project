package com.mostafa.interntdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    lateinit var btn_login: Button
    lateinit var btn_create: Button
    lateinit var et_email : TextInputEditText
    lateinit var et_password : TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intialviews()

        btn_login.setOnClickListener {
        val internt = Intent(this,SecendActivity::class.java)
            internt.putExtra("user",et_email.text.toString())
            internt.putExtra("password",et_password.text.toString())

            startActivity(internt)

        }
    }

    private fun intialviews(){
        btn_create =findViewById(R.id.btn_create)
        btn_login = findViewById(R.id.btn_login)
        et_email = findViewById(R.id.et_email)
        et_password = findViewById(R.id.et_password)
    }
}