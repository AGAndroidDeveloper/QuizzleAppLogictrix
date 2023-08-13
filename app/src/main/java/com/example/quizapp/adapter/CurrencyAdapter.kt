package com.example.quizapp.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.dataModel.QuizzleCurrency


class adapter(val context: Context, private val QuizzleCurrencyList: ArrayList<ArrayList<QuizzleCurrency>>) :
    RecyclerView.Adapter<adapter.MyViewHolder>() {



    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val mrecyclerView: RecyclerView = view.findViewById(R.id.HrecyclerView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view  = LayoutInflater.from(context).inflate(R.layout.quizzle_currency_list,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val arrayList: ArrayList<QuizzleCurrency> = QuizzleCurrencyList[position]

        holder.mrecyclerView.adapter = Itemadapter(context,arrayList)
    }


    // androidx.recyclerview.widget.RecyclerView.Adapter
    override fun getItemCount(): Int {
        return QuizzleCurrencyList.size
    }
}