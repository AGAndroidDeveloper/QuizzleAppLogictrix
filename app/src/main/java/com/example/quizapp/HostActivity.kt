package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.findNavController

class HostActivity : AppCompatActivity() {
    private var navController :NavController? = null
    private var bonus :ImageView? = null
    private var awards :ImageView? = null
    private var shop :ImageView? = null
    private var home  :ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host)

        bonus = findViewById(R.id.bonus)
        awards = findViewById(R.id.awards)
        shop = findViewById(R.id.shop)
      home = findViewById(R.id.home)
        navController = findNavController(R.id.fragmentContainerView)




        home!!.setOnClickListener {
            navController!!.navigate(R.id.action_quizzleWoodtreefrag_to_fragmentQuizzleHome)
        }
         bonus!!.setOnClickListener {
            navController!!.navigate(R.id.action_quizzleWoodtreefrag_to_quizzleBonus)
        }
         awards!!.setOnClickListener {
            navController!!.navigate(R.id.action_quizzleWoodtreefrag_to_quizzleWoodAwards)
        }
         shop!!.setOnClickListener {
            navController!!.navigate(R.id.action_quizzleWoodtreefrag_to_QuizzleShop)
        }










    }
}