package com.example.myapplication111.utils

import com.example.myapplication111.Question
import com.example.myapplication111.R

object Constants{

    const val Total = "Всего вопросов"
    const val Score = " "
    const val Congratulation = "Поздравление"

    fun getQuestions(): MutableList<Question>{
    val questions = mutableListOf<Question>()

        //1
        val q1 = Question(
            id = 1,
            question = "Кто является создателем дневников, которые дали название сериалу?",
            R.drawable._2,
            optionOne = "Елена Гилберт",
            optionTwo = "Стефан Сальваторе",
            optionThree = "Деймон Сальваторе",
            optionFour = "Кэтрин Пирс",
            correctAnswer = 2
        )

        questions.add(q1)

        //2
        val q2 = Question(
            id = 2,
            question = "Третий сын в семье Майклсонов,            `человек чести`? ",
            R.drawable._3,
            optionOne = "Клаус Майклсон",
            optionTwo = "Элайджа Майклсон",
            optionThree = "Кол Майклсон",
            optionFour = "Хенрик Майклсон",
            correctAnswer = 2
        )

        questions.add(q2)

        //3
        val q3 = Question(
            id = 3,
            question = "Что происходит с вампиром при попадании солнечного света без кольца защиты? ",
            R.drawable._4,
            optionOne = "Его кожа становится прозрачной",
            optionTwo = "Он превращается в пепел",
            optionThree = "Ничего не происходит",
            optionFour = "Вампир превращается в оборотня",
            correctAnswer = 2
        )

        questions.add(q3)

        //4
        val q4 = Question(
            id = 4,
            question = "Как звали близкую подругу Стефана, которая была знакома с ним ещё в 1920-х?",
            R.drawable._5,
            optionOne = "Кэролайн Форбс",
            optionTwo = "Лекси Брэнсон",
            optionThree = "Ребекка Майклсон",
            optionFour = "Бонни Беннетт",
            correctAnswer = 2
        )

        questions.add(q4)

        //5
        val q5 = Question(
            id = 5,
            question = "Как зовут этого героя сериала?",
            R.drawable._6,
            optionOne = "Мэтт Донован",
            optionTwo = "Джереми Гилберт",
            optionThree = "Стефан Сальваторе",
            optionFour = "Деймон Сальваторе",
            correctAnswer = 4
        )

        questions.add(q5)

        //6
        val q6 = Question(
            id = 6,
            question = "С кем встречалась Бонни Беннетт во втором сезоне?",
            R.drawable._8,
            optionOne = "Деймон Сальваторе",
            optionTwo = "Тайлер Локвуд",
            optionThree = "Мэтт Донован",
            optionFour = "Джереми Гилберт",
            correctAnswer = 4
        )

        questions.add(q6)

        //7
        val q7 = Question(
            id = 7,
            question = "Кто подарил Кэролайн Форбс этот рисунок?",
            R.drawable._9,
            optionOne = "Стефан Сальваторе",
            optionTwo = "Тайлер Локвуд",
            optionThree = "Клаус Майклсон",
            optionFour = "Деймон Сальваторе",
            correctAnswer = 3
        )

        questions.add(q7)

        //8
        val q8 = Question(
            id = 8,
            question = "Что произошло, когда Дэймон впервые сказал Елене, что любит ее?",
            R.drawable._10,
            optionOne = "Елена сказала, что любит Стефана",
            optionTwo = "Они поцеловались",
            optionThree = "Деймон заставил её забыть",
            optionFour = "Елена призналась во взаимности",
            correctAnswer = 3
        )

        questions.add(q8)

        //9
        val q9 = Question(
            id = 9,
            question = "В какой год переносятся Деймон и Бонни в 6 сезоне?",
            R.drawable._11,
            optionOne = "1994",
            optionTwo = "2000",
            optionThree = "1985",
            optionFour = "1920",
            correctAnswer = 1
        )

        questions.add(q9)

        //10
        val q10 = Question(
            id = 10,
            question = "С кем Деймон был в заточении 5 лет?",
            R.drawable._12,
            optionOne = "Кэтрин Пирс",
            optionTwo = "Тайлер Локвуд",
            optionThree = "Энзо Сент-Джон",
            optionFour = "Коннор Джордан",
            correctAnswer = 3
        )

        questions.add(q10)
        return questions

    }
}