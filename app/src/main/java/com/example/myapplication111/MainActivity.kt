package com.example.myapplication111

import android.content.Intent
import android.widget.Button
import android.os.Bundle
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val intent = Intent(this@MainActivity, QuestionActivity::class.java)
            startActivity(intent)
        }
        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            val intent = Intent(this@MainActivity, AuthorsActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
