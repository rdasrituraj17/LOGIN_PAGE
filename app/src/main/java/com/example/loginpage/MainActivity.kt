package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun show_s(){
            success.visibility = View.VISIBLE
            home.visibility = View.GONE
        }

        login_btn.setOnClickListener {
            var status = if(username_et.text.toString().equals("Rituraj")
                    && password_et.text.toString().equals("Hola")) "Logged In" else "Login Failed"
            Toast.makeText(this,status,Toast.LENGTH_SHORT).show()
            show_s()

        }
        forgot_btn.setOnClickListener {
            Toast.makeText(this,"Fuck Off",Toast.LENGTH_SHORT).show()
        }
    }
}