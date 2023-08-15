package com.example.quizapp.section10


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
import kotlin.jvm.internal.Intrinsics

class QuizzleWoodBonus : Fragment() {
    private var listView: ListView? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {




    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
          val view: View = inflater.inflate(R.layout.fragment_quizzle_wood_bonus, container, false)
        listView = view.findViewById<View>(com.example.quizapp.R.id.questionMasterList) as ListView
        val itemList: List<winnerList> = arrayListOf(
                winnerList("Question Master"),
                winnerList("Question Master"),
                winnerList("Question Master"),
                winnerList("Question Master"),
                winnerList("Question Master"),
                winnerList("Question Master"),
                winnerList("Question Master")
        )
        val arrayAdapter: ArrayAdapter<winnerList?> =
            object : ArrayAdapter<winnerList?>( requireContext(),0,itemList) {
                // from class: com.quizzle.quizzle.section10.QuizzleHomeBonus$onCreateView$adapter$1
                // android.widget.ArrayAdapter, android.widget.Adapter
                override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                    val view2: View = convertView
                        ?: LayoutInflater.from(context)
                            .inflate(R.layout.fragment_quistion_master, parent, false)
                    val findViewById = view2.findViewById<View>(R.id.questionMasterTittle)

                    val deviceNameTextView = findViewById as TextView
                    val deviceData = itemList[position]
                    deviceNameTextView.text = deviceData?.name

                    return view2
                }
            }
        val listView = listView

        listView!!.adapter = arrayAdapter as ListAdapter
        return view
    }
}