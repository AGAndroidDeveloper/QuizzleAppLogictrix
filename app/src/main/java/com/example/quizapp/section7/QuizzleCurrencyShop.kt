package com.example.quizapp.section7


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.adapter.adapter
import com.example.quizapp.dataModel.QuizzleCurrency
import com.example.quizapp.section7.currencylist.returnCurrencyList.returnList
import kotlin.jvm.internal.Intrinsics


class QuizzleCurrencyShop : Fragment() {
    private var recyclerView: RecyclerView? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Intrinsics.checkNotNullParameter(view, "view")
     recyclerView = view.findViewById(R.id.quizzleShopRecyclerView) as RecyclerView
        val list1: ArrayList<QuizzleCurrency> = returnList()
        val list2: ArrayList<QuizzleCurrency> = returnList()
        val list3: ArrayList<QuizzleCurrency> = returnList()
        val list4: ArrayList<QuizzleCurrency> = returnList()
        val list5: ArrayList<QuizzleCurrency> = returnList()





        val finalList: ArrayList<ArrayList<QuizzleCurrency>> =arrayListOf(list1, list2, list3, list4, list5)
        val context = view.context
        val adapter = adapter(context, finalList)

        recyclerView!!.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quizzle_currency_shop, container, false)
    }


}