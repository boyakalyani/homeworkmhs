package com.example.homeworkmhs

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var txt2: TextView
    lateinit var search: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        txt2 = findViewById(R.id.txt2_id)
        search = findViewById(R.id.editsearch_id)
        txt2.setOnClickListener() {
            var implicit_intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/"))
            startActivity(implicit_intent)
        }
        search.setOnClickListener() {
            var implisi_intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("http://www.example.com/result/?q=*search_string*")
            )
            startActivity(implisi_intent)
        }
    }
}