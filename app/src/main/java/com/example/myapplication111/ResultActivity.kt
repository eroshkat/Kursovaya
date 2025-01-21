package com.example.myapplication111

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.myapplication111.utils.Constants

class ResultActivity: ComponentActivity() {
        private lateinit var textViewCongratulation: TextView
        private lateinit var textViewScore: TextView

        @SuppressLint("SetTextI18n")
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.result)

        textViewScore = findViewById(R.id.total)
        textViewCongratulation = findViewById(R.id.congrats)

        val totalQuestions = intent.getIntExtra(Constants.Total, 0)
        val score = intent.getIntExtra(Constants.Score, 0)
        val congratulation = intent.getStringExtra(Constants.Congratulation)

        textViewScore.text = "$score / $totalQuestions"

        if (score < 6) {
            textViewCongratulation.text = "      Пересмотри сериал ещё раз!"
        }
            else if (score < 9) {
                textViewCongratulation.text = "      Хороший результат!"

            } else {
                textViewCongratulation.text = "      Ты лучший фанат Дневников!"
            }

            val bt1 = findViewById<Button>(R.id.bt1)
            bt1.setOnClickListener {
                val intent = Intent(this@ResultActivity, AuthorsActivity::class.java)
                startActivity(intent)
                finish()
            }

            val bt2 = findViewById<Button>(R.id.bt2)
            bt2.setOnClickListener {
                val intent = Intent(this@ResultActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }

    }
}

