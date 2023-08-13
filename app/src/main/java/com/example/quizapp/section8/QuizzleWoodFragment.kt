package com.example.quizapp.section8


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.quizapp.R
import kotlin.jvm.internal.Intrinsics


class QuizzleWoodtreefrag : Fragment() {
    var fruit: ImageView? = null
    var Spin: ImageView? = null
    var chest: ImageView? = null
    var dice: ImageView? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       Spin!!.setOnClickListener {
           findNavController().navigate(R.id.action_quizzleWoodtreefrag_to_quizzleWoodSpin)

       }

        fruit!!.setOnClickListener {
           findNavController().navigate(R.id.action_quizzleWoodtreefrag_to_quizzleWoodfruit)
       }

        chest!!.setOnClickListener {
            findNavController().navigate(R.id.action_quizzleWoodtreefrag_to_quizzleWoodchest)

        }

        dice!!.setOnClickListener {
            findNavController().navigate(R.id.action_quizzleWoodtreefrag_to_quizzleWooddice)

        }




    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        val view: View = inflater.inflate(R.layout.fragment_quizzle_wood, container, false)
        fruit = view.findViewById<View>(R.id.fruit) as ImageView
        Spin = view.findViewById<View>(R.id.spin) as ImageView
        chest = view.findViewById<View>(R.id.chest) as ImageView
        dice = view.findViewById<View>(R.id.dice) as ImageView
        return view
    }

}