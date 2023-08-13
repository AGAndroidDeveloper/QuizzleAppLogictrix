
package com.example.quizapp

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.quizapp.databinding.ActivityHomeBinding
import com.example.quizapp.menufragment.Feddback
import com.example.quizapp.menufragment.HelpAndGuides
import com.example.quizapp.menufragment.MyAccountFragment
import com.example.quizapp.menufragment.Profile
import com.example.quizapp.menufragment.Settings
import com.example.quizapp.menufragment.Statictics
import com.example.quizapp.menufragment.menu

 class Home : AppCompatActivity() {
    var host: NavHostFragment? =null
     private var dialog :Dialog? = null
    private lateinit var navController: NavController

    private var binding :ActivityHomeBinding? = null
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)
//        host =
//            supportFragmentManager.findFragmentById(androidx.navigation.fragment.R.id.nav_host_fragment_container) as NavHostFragment?
//
//        navController = host!!.navController     // this host's navigation controller
        val fragment = Statictics()
        // Create an instance of the new fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.my_nav_host_fragment, fragment)
            .addToBackStack(null) // Optional: Add the transaction to the back stack
            .commit()

        binding?.menuImage!!.setOnClickListener {
            val fragment1 = menu()
            // Create an instance of the new fragment
            supportFragmentManager.beginTransaction()
                .replace(R.id.my_nav_host_fragment, fragment1)
                .addToBackStack(null) // Optional: Add the transaction to the back stack
                .commit()
     }


    }
}