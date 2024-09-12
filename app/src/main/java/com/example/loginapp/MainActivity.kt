package com.example.loginapp

import android.os.Bundle
import android.service.controls.ControlsProviderService.TAG
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.DataInput

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.login_btn)
        passwordInput = findViewById(R.id.password_input)
        loginBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener(){
            val username = usernameInput.text.toString()
            val password = usernameInput.text.toString()
            Log.i(TAG, "onCreate:username : $username amd pass : $password ")
        }
        }
    }
