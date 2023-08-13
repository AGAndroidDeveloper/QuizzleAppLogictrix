package com.example.quizapp.section10


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.quizapp.R
import com.example.quizapp.dataModel.WinnerList.winnerList
import kotlin.jvm.internal.Intrinsics

class QuizzleWoodBonus : Fragment() {
    private var listView: ListView? = null
    fun getListView(): ListView? {
        return listView
    }

    fun setListView(listView: ListView?) {
        this.listView = listView
    }

    // androidx.fragment.app.Fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Intrinsics.checkNotNullParameter(inflater, "inflater")
        val view: View = inflater.inflate(R.layout.fragment_quizzle_wood_bonus, container, false)
        listView = view.findViewById<View>(com.example.quizapp.R.id.questionMasterList) as ListView
        val itemList: List<*> = CollectionsKt.arrayListOf(
                winnerList("Question Master"),
                winnerList("Question Master"),
                winnerList("Question Master"),
                winnerList("Question Master"),
                winnerList("Question Master"),
                winnerList("Question Master"),
                winnerList("Question Master")
        )
        val arrayAdapter: ArrayAdapter<winnerList> =
            object : ArrayAdapter<winnerList?>(itemList, requireContext()) {
                // from class: com.quizzle.quizzle.section10.QuizzleHomeBonus$onCreateView$adapter$1
                // android.widget.ArrayAdapter, android.widget.Adapter
                override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                    val view2: View
                    Intrinsics.checkNotNullParameter(parent, "parent")
                    if (convertView != null) {
                        view2 = convertView
                    } else {
                        view2 = LayoutInflater.from(context)
                            .inflate(R.layout.question_master, parent, false)
                    }
                    val findViewById = view2.findViewById<View>(R.id.questionMasterTittle)
                    Intrinsics.checkNotNullExpressionValue(
                            findViewById,
                            "view.findViewById(R.id.questionMasterTittle)"
                    )
                    val deviceNameTextView = findViewById as TextView
                    val deviceData = getItem(position)
                    deviceNameTextView.text = deviceData?.name
                    Intrinsics.checkNotNullExpressionValue(view2, "view")
                    return view2
                }
            }
        val listView = listView
        Intrinsics.checkNotNull(listView)
        listView!!.adapter = arrayAdapter as ListAdapter
        return view
    }
}