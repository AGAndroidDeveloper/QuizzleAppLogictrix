package com.example.quizapp.menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.R
import com.example.quizapp.adapter.MyAdapter


class Statictics : Fragment() {
private var mrecycle :RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_statictics, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mrecycle = view.findViewById(R.id.recyclerView)

       // mrecycle!!.adapter = MyAdapter(view.context,)
    }

}