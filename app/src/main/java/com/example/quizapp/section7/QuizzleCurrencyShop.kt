package com.example.quizapp.section7


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.adapter.adapter
import com.example.quizapp.dataModel.QuizzleCurrency
import com.example.quizapp.section7.currencylist.returnCurrencyList.listOfPowerUp
import com.example.quizapp.section7.currencylist.returnCurrencyList.listOfSubScriPtions
import com.example.quizapp.section7.currencylist.returnCurrencyList.returnList


class QuizzleCurrencyShop : Fragment() {
    private var recyclerView: RecyclerView? = null
    private var image1 :LinearLayout? = null
    private var image2 :LinearLayout? = null
    private var image3 :LinearLayout? = null

    private var quizzleImage :ImageView? = null
    private var powerUpImage :ImageView? = null
    private var quizzlevilleImage:ImageView? = null
    private var subscriptionImage:ImageView? = null




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        quizzleShopCurrency(view)

        image1?.setOnClickListener {

            image1!!.setBackgroundResource(R.drawable.white_circle_shop_currency_background);
            image2!!.background = null
            image2!!.alpha = 0.3F
            image3!!.alpha = 0.3F
            image3!!.background = null
            image1!!.alpha =1F

        }


 image2?.setOnClickListener {
     image2!!.setBackgroundResource(R.drawable.white_circle_shop_currency_background);
     image1!!.background = null
     image3!!.background = null
     image1!!.alpha = 0.3F
     image3!!.alpha = 0.3F
     image2!!.alpha =1F
        }


 image3?.setOnClickListener {
     image3!!.setBackgroundResource(R.drawable.white_circle_shop_currency_background);
     image2!!.background = null
     image1!!.background = null
     image2!!.alpha = 0.3F
     image1!!.alpha = 0.3F
     image3!!.alpha =1F
        }



        val imageViewArray = arrayOf(quizzleImage, powerUpImage, quizzlevilleImage, subscriptionImage)
        val imageResources = arrayOf(
                R.drawable.quizzle_shop_nav_quizzles_on,
                R.drawable.quizzle_shop_nav_powerups_on,
                R.drawable.quizzle_shop_nav_quizzleville_on,
                R.drawable.quizzle_shop_nav_subscriptions_on
        )
        val defaultResources = arrayOf(
                R.drawable.quizzle_shop_nav_quizzles_off,
                R.drawable.quizzle_shop_nav_powerups_off,
                R.drawable.quizzle_shop_nav_quizzleville_off,
                R.drawable.quizzle_shop_nav_subscriptions_off
        )

        for (i in imageViewArray.indices) {
            imageViewArray[i]?.setOnClickListener {
                for (j in imageViewArray.indices) {
                    imageViewArray[j]?.setImageResource(if (i == j) imageResources[j] else defaultResources[j])
                }

                when(i){
                    0 ->{
                        quizzleShopCurrency(view)
                    }

                    1 ->{
powerUpList(view)
                    }

                    2 ->{


                    }

                    3->{
                        subscriptions(view)


                    }





                }
            }






        }




    }


    private fun subscriptions(view: View){

        recyclerView = view.findViewById(R.id.quizzleShopRecyclerView) as RecyclerView
        val list1: ArrayList<QuizzleCurrency> = ArrayList(listOfSubScriPtions().subList(0,3))
        val list2: ArrayList<QuizzleCurrency> = ArrayList(listOfSubScriPtions().subList(3,6))

        val finalList: ArrayList<ArrayList<QuizzleCurrency>> =
            arrayListOf(list1, list2)
        val context = view.context
        val adapter = adapter(context, finalList)

        recyclerView!!.adapter = adapter

    }
    private fun powerUpList(view: View){

        recyclerView = view.findViewById(R.id.quizzleShopRecyclerView) as RecyclerView
        val list1: ArrayList<QuizzleCurrency> = ArrayList(listOfPowerUp().subList(0,4))
        val list2: ArrayList<QuizzleCurrency> = ArrayList(listOfPowerUp().subList(4,8))
        val list3: ArrayList<QuizzleCurrency> = ArrayList(listOfPowerUp().subList(4,8))

        val finalList: ArrayList<ArrayList<QuizzleCurrency>> =
            arrayListOf(list1, list2,list3)
        val context = view.context
        val adapter = adapter(context, finalList)

        recyclerView!!.adapter = adapter

    }

    private fun quizzleShopCurrency(view: View) {
        recyclerView = view.findViewById(R.id.quizzleShopRecyclerView) as RecyclerView
        val list1: ArrayList<QuizzleCurrency> = returnList()
        val list2: ArrayList<QuizzleCurrency> = returnList()
        val list3: ArrayList<QuizzleCurrency> = returnList()
        val list4: ArrayList<QuizzleCurrency> = returnList()
        val list5: ArrayList<QuizzleCurrency> = returnList()

        val finalList: ArrayList<ArrayList<QuizzleCurrency>> =
            arrayListOf(list1, list2, list3, list4, list5)
        val context = view.context
        val adapter = adapter(context, finalList)

        recyclerView!!.adapter = adapter
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view =  inflater.inflate(R.layout.fragment_quizzle_currency_shop, container, false)

        image1 = view.findViewById(R.id.starImage)
        image2 = view.findViewById(R.id.quizzlevilleImage)
        image3 = view.findViewById(R.id.uroImage)

        quizzleImage = view.findViewById(R.id.quizzle)
        powerUpImage = view.findViewById(R.id.powerUps)
        quizzlevilleImage = view.findViewById(R.id.quizzleville)
        subscriptionImage = view.findViewById(R.id.subscription)

        return view
    }


}