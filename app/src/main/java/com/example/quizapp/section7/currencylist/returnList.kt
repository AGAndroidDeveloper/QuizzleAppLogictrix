package com.example.quizapp.section7.currencylist

import com.example.quizapp.R
import com.example.quizapp.dataModel.QuizzleCurrency


object returnCurrencyList {
    fun returnList(): ArrayList<QuizzleCurrency> {
        return arrayListOf(
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_4, "15$","x25"),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_2, "12$","x50"),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_1, "15$","x100"),
                QuizzleCurrency(
                        R.drawable.quizzleshop_quizzles_1,
                        "1992$","x200"
                ),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_3, "16$","x500"),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_4, "15$","x1000"),
                QuizzleCurrency(
                        R.drawable.quizzleshop_quizzles_2,
                        "40002$","x2000"
                ),
                QuizzleCurrency(R.drawable.quizzleshop_quizzles_4, "15$","x5000"),

                QuizzleCurrency(R.drawable.quizzleshop_quizzles_1, "62$","x7500"),
                QuizzleCurrency(
                        R.drawable.quizzleshop_quizzles_4,
                        "15545$","x10000"
                ) ,
                QuizzleCurrency(
                        R.drawable.quizzleshop_quizzles_4,
                        "15545$","x25000"
                )
                        ,QuizzleCurrency(
                        R.drawable.quizzleshop_quizzles_4,
                        "15545$","x50000"
                )
        )
    }


    fun listOfSubScriPtions():ArrayList<QuizzleCurrency>{
        return arrayListOf(

                QuizzleCurrency(R.drawable.quizzle_shop_viq_item,"€4.99",""),
                QuizzleCurrency(R.drawable.quizzle_shop_viq_item,"€4.99",""),
                QuizzleCurrency(R.drawable.season_pass_icon,"€2.89",""),
                QuizzleCurrency(R.drawable.quizzlemania_icon,"€4.99",""),
                QuizzleCurrency(R.drawable.quizzlelandia_3dgraphic_land,"€4.99",""),
                QuizzleCurrency(R.drawable.quizzleshop_quizzle_quest_unlock,"€4.99",""),

                )
    }


    fun listOfPowerUp() :ArrayList<QuizzleCurrency>{


        return arrayListOf(
                QuizzleCurrency(R.drawable.quizzleshop_split_powerup,"€4.99",""),
                QuizzleCurrency(R.drawable.quizzleshop_correct_powerup,"€4.99",""),
                QuizzleCurrency(R.drawable.quizzleshop_skip_powerup,"€4.99",""),
                QuizzleCurrency(R.drawable.quizzleshop_bomb_powerup,"€4.99",""),

                QuizzleCurrency(R.drawable.quizzleshop_powerpacks_1,"€4.99",""),
                QuizzleCurrency(R.drawable.quizzleshop_powerpacks_2,"€4.99",""),
                QuizzleCurrency(R.drawable.quizzleshop_powerpacks_3,"€4.99",""),
                QuizzleCurrency(R.drawable.heart_icon,"€4.99",""),

                QuizzleCurrency(R.drawable.quizzleshop_max_life_1,"€4.99",""),
                QuizzleCurrency(R.drawable.quizzleshop_star_earnx2,"€4.99",""),
                QuizzleCurrency(R.drawable.quizzleshop_max_life_1,"€4.99",""),
                QuizzleCurrency(R.drawable.feather_icon,"€4.99",""),

                )
    }



}