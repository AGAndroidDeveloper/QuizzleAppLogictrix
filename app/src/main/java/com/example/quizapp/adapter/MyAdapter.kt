package com.example.quizapp.adapter

import android.content.Context
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.StatisticsModel
import com.example.quizapp.databinding.ActivityHomeBinding
import com.example.quizapp.databinding.StatisticsItemBinding

class MyAdapter(private val context: Context,private val dataList:ArrayList<StatisticsModel>)
    :RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    class MyViewHolder(binding: StatisticsItemBinding)  :RecyclerView.ViewHolder(binding.root){
        val question :TextView = binding.question
        val answer :TextView = binding.answer
        val totalAnswer :TextView = binding.answer

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}