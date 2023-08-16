package com.example.quizapp.section8.game

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.DecelerateInterpolator
import android.view.animation.RotateAnimation
import android.widget.ImageView
import com.example.quizapp.R
import java.util.Random

class QuizzleWoodgame3 : Fragment() {
    private var spinImageBtn :ImageView? = null
    private var spinWheelImage :ImageView? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val itemSize = 8 // Number of items on the spin wheel
        val itemAngle = 360f / itemSize // Angle per item

        spinImageBtn!!.setOnClickListener {
            val fullRotations = 3
            val randomFraction = Random().nextFloat() // Random fraction [0, 1)
            val randomItem = ((fullRotations * itemSize) + (randomFraction * itemSize)).toInt()
            val randomAngle = randomItem * itemAngle // Calculate the corresponding angle for the item

            // Use the randomAngle to set the final rotation
            val rotateAnim = RotateAnimation(
                    0F, randomAngle,
                    Animation.RELATIVE_TO_SELF, .5f,
                    Animation.RELATIVE_TO_SELF, .5f
            )
            rotateAnim.duration = 2000 // 2 seconds for the spin animation
            rotateAnim.fillAfter = true
            rotateAnim.interpolator = DecelerateInterpolator()


            rotateAnim.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {
                    // Animation start event
                }

                override fun onAnimationEnd(animation: Animation?) {
                    // Animation end event
                    val selectedItemIndex = ((randomAngle + itemAngle / 2) / itemAngle).toInt()
                    // Handle the selected item index as needed
                    Log.e("selectedItemIndex", selectedItemIndex.toString())

                }

                override fun onAnimationRepeat(animation: Animation?) {
                    // Animation repeat event
                }
            })

            spinWheelImage?.startAnimation(rotateAnim)
        }

    }



    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

  val view =  inflater.inflate(R.layout.fragment_quizzle_woodgame3, container, false)

        spinImageBtn = view.findViewById(R.id.spinWheelBtn)
        spinWheelImage = view.findViewById(R.id.spinWheelImage)



        return view

    }


}