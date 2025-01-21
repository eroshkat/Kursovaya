package com.example.myapplication111

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat
import com.example.myapplication111.utils.Constants

class QuestionActivity : ComponentActivity(), View.OnClickListener {
    private lateinit var textViewQuestion: TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var imageView: ImageView
    private lateinit var textViewOptionOne: TextView
    private lateinit var textViewOptionTwo: TextView
    private lateinit var textViewOptionThree: TextView
    private lateinit var textViewOptionFour: TextView
    private lateinit var button: Button

    private var questionsCounter = 0
    private lateinit var questionsList: MutableList<Question>
    private var selectedAnswer = 0
    private lateinit var currentQuestion: Question
    private var answered = false
    private var score = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        textViewQuestion = findViewById<TextView>(R.id.dv_q)
        imageView = findViewById<ImageView>(R.id.imageView2)
        button = findViewById<Button>(R.id.button5)
        progressBar = findViewById<ProgressBar>(R.id.progressbar)

        textViewOptionOne = findViewById<TextView>(R.id.dvoptionOne)
        textViewOptionTwo = findViewById<TextView>(R.id.dvoptionTwo)
        textViewOptionThree = findViewById<TextView>(R.id.dvoptionThree)
        textViewOptionFour = findViewById<TextView>(R.id.dvoptionFour)

        textViewOptionOne.setOnClickListener(this)
        textViewOptionTwo.setOnClickListener(this)
        textViewOptionThree.setOnClickListener(this)
        textViewOptionFour.setOnClickListener(this)
        button.setOnClickListener(this)

        questionsList = Constants.getQuestions()
        Log.d("QuestionSize", "${questionsList.size}")
        setQuestion()
    }

    @SuppressLint("SuspiciousIndentation")
    private fun setQuestion() {
        resetOptions()
        val question = questionsList[questionsCounter]
        imageView.setImageResource(question.image)
        textViewQuestion.text = question.question
        textViewOptionOne.text = question.optionOne
        textViewOptionTwo.text = question.optionTwo
        textViewOptionThree.text = question.optionThree
        textViewOptionFour.text = question.optionFour
        progressBar.progress = questionsCounter

        if (questionsCounter == 9) {
            currentQuestion = questionsList[questionsCounter]
            resetOptions()
            val question = questionsList[questionsCounter]
            imageView.setImageResource(question.image)
            textViewQuestion.text = question.question
            textViewOptionOne.text = question.optionOne
            textViewOptionTwo.text = question.optionTwo
            textViewOptionThree.text = question.optionThree
            textViewOptionFour.text = question.optionFour
            progressBar.progress = questionsCounter

            button.setOnClickListener {
                Intent(this@QuestionActivity, ResultActivity::class.java).also {
                    it.putExtra(Constants.Score, score)
                    it.putExtra(Constants.Total, questionsList.size)
                    startActivity(it)
                    finish()
                }
            }
        } else {
            button.text = "Выбрать ответ"
        }
        questionsCounter++
        answered = false
    }

    private fun resetOptions() {
        val options = mutableListOf<TextView>()
        options.add(textViewOptionOne)
        options.add(textViewOptionTwo)
        options.add(textViewOptionThree)
        options.add(textViewOptionFour)

        for (option in options) {
            option.setTextColor(Color.parseColor("#FFFFFFFF"))
            option.typeface = android.graphics.Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.button
            )
        }
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.dvoptionOne -> {
                selectedOption(textViewOptionOne, 1)
            }

            R.id.dvoptionTwo -> {
                selectedOption(textViewOptionTwo, 2)
            }

            R.id.dvoptionThree -> {
                selectedOption(textViewOptionThree, 3)
            }

            R.id.dvoptionFour -> {
                selectedOption(textViewOptionFour, 4)
            }

            R.id.button5 -> {
                if (answered) {
                    setQuestion()
                    button.text = "Выбрать ответ"
                } else {
                    checkAnswer()
                    button.text = "Следующий вопрос"

                }
                selectedAnswer = 0
            }
        }
    }

    private fun selectedOption(textView: TextView, selectOptionNumber: Int) {
        resetOptions()
        selectedAnswer = selectOptionNumber

        textView.setTextColor(Color.parseColor("#FFFFFFFF"))
        textView.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_button
        )
    }

    private fun checkAnswer() {
        answered = true
        score++
    }
}
