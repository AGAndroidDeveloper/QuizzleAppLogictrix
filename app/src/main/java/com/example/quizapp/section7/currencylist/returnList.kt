package com.example.quizapp.section7.currencylist

import com.example.quizapp.R
import com.example.quizapp.dataModel.QuizzleCurrency


object returnCurrencyList {
    fun returnList(): ArrayList<QuizzleCurrency> {
        return arrayListOf(
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_4, "15$"),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_2, "12$"),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_1, "15$"),
                QuizzleCurrency(
                        R.drawable.quizzleshop_quizzles_1,
                        "1992$"
                ),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_3, "16$"),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_4, "15$"),
                QuizzleCurrency(
                        R.drawable.quizzleshop_quizzles_2,
                        "40002$"
                ),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_4, "15$"),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_1, "62$"),
                QuizzleCurrency(
                        R.drawable.quizzleshop_quizzles_4,
                        "15545$"
                )
        )
    }


}