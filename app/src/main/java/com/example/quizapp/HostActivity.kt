package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment

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
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

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