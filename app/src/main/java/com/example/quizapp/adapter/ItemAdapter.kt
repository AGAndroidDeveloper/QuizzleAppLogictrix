package com.example.quizapp.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.dataModel.QuizzleCurrency
import kotlin.jvm.internal.Intrinsics


class Itemadapter(val context: Context, private val CurrencyList: ArrayList<QuizzleCurrency>) :
    RecyclerView.Adapter<Itemadapter.MYViewHolder>() {



    class MYViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.currencyImage)
        val currency: TextView =  view.findViewById(R.id.buyBtn)


    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MYViewHolder {
        Intrinsics.checkNotNullParameter(parent, "parent")
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.quizzle_currency_item, parent, false)

        return MYViewHolder(view)
    }

    override fun getItemCount(): Int {
        return CurrencyList.size
    }

    override fun onBindViewHolder(holder: MYViewHolder, position: Int) {
        Intrinsics.checkNotNullParameter(holder, "holder")
        val quizzleCurrency = CurrencyList[position]
        Intrinsics.checkNotNullExpressionValue(quizzleCurrency, "CurrencyList[position]")
        holder.imageView.setImageResource(quizzleCurrency.quizzleshopQuizzles4)
        holder.currency.text = quizzleCurrency.s
    }
}