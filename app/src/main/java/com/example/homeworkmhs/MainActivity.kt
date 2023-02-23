package com.example.homeworkmhs

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btnrey: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnrey = findViewById(R.id.btn1_id)
        btnrey.setOnClickListener() {
            Toast.makeText(this,"hii",Toast.LENGTH_SHORT).show()
//                myToast.setGravity(Gravity.LEFT,200,200)
//            myToast.show()
        }
        btnrey.setOnClickListener() {
            val kalyani = Intent(this, MainActivity2::class.java)
            startActivity(kalyani)
        }
        }
    }
