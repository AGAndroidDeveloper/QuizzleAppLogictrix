package com.example.quizapp.section7


import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.adapter.Itemadapter
import com.example.quizapp.adapter.adapter
import com.example.quizapp.dataModel.QuizzleCurrency
import com.example.quizapp.section7.currencylist.returnCurrencyList.listOfPowerUp
import com.example.quizapp.section7.currencylist.returnCurrencyList.listOfQuizzleVille
import com.example.quizapp.section7.currencylist.returnCurrencyList.listOfSubScriPtions
import com.example.quizapp.section7.currencylist.returnCurrencyList.returnList


class QuizzleCurrencyShop : Fragment(), Itemadapter.OnItemClickListener {
    private var recyclerView: RecyclerView? = null
    private var image1 :LinearLayout? = null
    private var image2 :LinearLayout? = null
    private var image3 :LinearLayout? = null

    private var quizzleImage :ImageView? = null
    private var powerUpImage :ImageView? = null
    private var quizzlevilleImage:ImageView? = null
    private var subscriptionImage:ImageView? = null
    private var  images : List<LinearLayout>? = null

    private var key :Int = 2



    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        quizzleShopCurrency(view,key)
        Toast.makeText(requireView().context," filtered by $key",Toast.LENGTH_SHORT).show()

        image1?.setOnClickListener { updateImageState(image1!!,0) }
        image2?.setOnClickListener { updateImageState(image2!!,1) }
        image3?.setOnClickListener { updateImageState(image3!!,2) }



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
                    imageViewArray[j]?.setImageResource(
                            if (i == j) imageResources[j] else defaultResources[j])
                }

                when(i){
                    0 ->{
                        quizzleShopCurrency(view, key)
                    }



                    1 ->{

                        powerUpList(view,key)

                    }

                    2 ->{

                        val list1 = ArrayList(listOfQuizzleVille() )
                        val list2 = ArrayList(listOfQuizzleVille() )
                        val list3 = ArrayList(listOfQuizzleVille())
                       val list4 = ArrayList(listOfQuizzleVille())
                       val list5 = ArrayList(listOfQuizzleVille())
                        Log.e("key",key.toString())
                        val finalList: ArrayList<ArrayList<QuizzleCurrency>> =
                            arrayListOf(list1, list2, list3,list4,list5)

                        val context = view.context
                        val adapter = adapter(context, finalList)
                        recyclerView!!.adapter = adapter


//                        if(key==0){
//                            list1.remove(list1[2])
//                            list1.remove(list1[0])
//
//                            Log.e("list1","$list1")
//                            Log.e("list2","$list2")
//                            list2.remove(list2[2])
//                            list2.remove(list2[0])
//                          adapter.notifyDataSetChanged()
//                        }
//
//                        if (key==1){
//                            list1.remove(list1[2])
//                            list1.remove(list1[1])
//                            list2.remove(list2[2])
//                            list2.remove(list2[2])
//                           adapter.notifyDataSetChanged()
//                        }


                    }

                    3->{
                        subscriptions(view,key)


                    }
                }
            }
        }




    }
    private fun updateImageState(selectedImage: LinearLayout, i: Int) {
        images!!.forEach { image ->
            if (image == selectedImage) {
                image.setBackgroundResource(R.drawable.white_circle_shop_currency_background)
                image.alpha = 1F
                key = i
                Toast.makeText(requireView().context," filtered by $key",Toast.LENGTH_SHORT).show()

            } else {

                image.background = null
                image.alpha = 0.3F
            }
        }
    }


    private fun subscriptions(view: View, key: Int){

        recyclerView = view.findViewById(R.id.quizzleShopRecyclerView) as RecyclerView
        val list1: ArrayList<QuizzleCurrency> = ArrayList(listOfSubScriPtions().subList(0,4))
        val list2: ArrayList<QuizzleCurrency> = ArrayList(listOfSubScriPtions().subList(3,7))


        val finalList: ArrayList<ArrayList<QuizzleCurrency>> =
            arrayListOf(list1, list2)
        val context = view.context
        val adapter = adapter(context, finalList)

        recyclerView!!.adapter = adapter

    }
    private fun powerUpList(view: View, key: Int){

        recyclerView = view.findViewById(R.id.quizzleShopRecyclerView) as RecyclerView
        val list1: ArrayList<QuizzleCurrency> = ArrayList(listOfPowerUp())
        val list2: ArrayList<QuizzleCurrency> = ArrayList(listOfPowerUp())
        val list3: ArrayList<QuizzleCurrency> = ArrayList(listOfPowerUp())
        val list4: ArrayList<QuizzleCurrency> = ArrayList(listOfPowerUp())
        val list5: ArrayList<QuizzleCurrency> = ArrayList(listOfPowerUp())

        val finalList: ArrayList<ArrayList<QuizzleCurrency>> =
            arrayListOf(list1, list2,list3,list4,list5)
        val context = view.context
        val adapter = adapter(context, finalList)

        recyclerView!!.adapter = adapter

    }

    private fun quizzleShopCurrency(view: View, key: Int) {
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
        recyclerView = view.findViewById(R.id.quizzleShopRecyclerView) as RecyclerView

        images = listOf(image1!!, image2!!, image3!!)
        quizzleImage = view.findViewById(R.id.quizzle)
        powerUpImage = view.findViewById(R.id.powerUps)
        quizzlevilleImage = view.findViewById(R.id.quizzleville)
        subscriptionImage = view.findViewById(R.id.subscription)

        return view
    }

    override fun onItemClick(item: QuizzleCurrency) {





    }


}