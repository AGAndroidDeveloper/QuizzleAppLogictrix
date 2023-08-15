package com.example.quizapp.section9


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.quizapp.R
import com.example.quizapp.dataModel.winnerList
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.NonDisposableHandle.parent
import kotlin.jvm.internal.Intrinsics



class progressAll : Fragment() {
private var listView :ListView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        listView = view.findViewById(R.id.top100List)

        val itemList: List<winnerList> = arrayListOf(

                winnerList("danTheDestroyer"),  winnerList("danTheDestroyer"),
                winnerList("danTheDestroyer"),  winnerList("danTheDestroyer"),
                winnerList("danTheDestroyer"),  winnerList("danTheDestroyer"),
                winnerList("danTheDestroyer"),  winnerList("danTheDestroyer"),
                winnerList("danTheDestroyer"),  winnerList("danTheDestroyer"),
                winnerList("danTheDestroyer"),  winnerList("danTheDestroyer"),
                winnerList("danTheDestroyer"),  winnerList("danTheDestroyer"),
                winnerList("danTheDestroyer"),  winnerList("danTheDestroyer"),
                winnerList("danTheDestroyer"),  winnerList("danTheDestroyer"),

        )




        val arrayAdapter: ArrayAdapter<winnerList?> =
            object : ArrayAdapter<winnerList?>( requireContext(),0,itemList) {
                // from class: com.quizzle.quizzle.section10.QuizzleHomeBonus$onCreateView$adapter$1
                // android.widget.ArrayAdapter, android.widget.Adapter
                override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                    val view2: View = convertView
                        ?: LayoutInflater.from(context)
                            .inflate(R.layout.top100_quizzler_list, parent, false)
                  //  val findViewById = view2.findViewById<View>()

                   // val deviceNameTextView = findViewById as TextView
                    val deviceData = itemList[position]
                  //  deviceNameTextView.text = deviceData?.name

                    return view2
                }
            }
        val listView = listView

        listView!!.adapter = arrayAdapter as ListAdapter



      //  listView.adapter = arrayAdapter as ListAdapter
    }
    @OptIn(InternalCoroutinesApi::class)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        val view: View = inflater.inflate(R.layout.fragment_quizzle_wood_awards, container, false)

//        val arrayAdapter: ArrayAdapter<winnerList> = object :ArrayAdapter<winnerList>(requireContext(),R.layout.top100_quizzler_list){
//            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//                val itemView: View = convertView ?: LayoutInflater.from(context)
//                    .inflate(R.layout.top100_quizzler_list, parent, false)
//
//
//             val quizzlerName  =    itemView.findViewById<TextView>(R.id.dan)
//                quizzlerName.text = winnerList[position]
//
//                return itemView
//            }
//
//        }


        return view

    }


}