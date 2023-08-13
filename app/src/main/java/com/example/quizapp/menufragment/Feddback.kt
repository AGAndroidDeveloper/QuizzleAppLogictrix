package com.example.quizapp.menufragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.quizapp.R

// TODO: Rename parameter arguments, choose names that match
//
class Feddback : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feddback, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val languages = resources.getStringArray(R.array.programming_languages)
        // create an array adapter and pass the required parameter
        // in our case pass the context, drop down layout , and array.
        val arrayAdapter = ArrayAdapter(requireView().context, R.layout.drop_down_layout, languages)
        // get reference to the autocomplete text view
        val autocompleteTV =requireView().findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        // set adapter to the autocomplete tv to the arrayAdapter
autocompleteTV.setAdapter(arrayAdapter)
    }

}