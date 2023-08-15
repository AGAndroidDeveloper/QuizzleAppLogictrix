package com.example.quizapp.section7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.quizapp.R


class QuizzleWoodshop2 : Fragment() {
var image :ImageView? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        view.setOnClickListener {
            findNavController().navigate(R.id.action_QuizzleShop_to_quizzleCurrencyShop)
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    val view =  inflater.inflate(R.layout.fragment_quizzle_woodshop2, container, false)

       image = view.findViewById(R.id.quizzle_shop_board)



        return view

    }


}