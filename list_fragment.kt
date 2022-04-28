package com.example.sample_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class list_fragment : Fragment() {

    lateinit var  recyclerView_list: RecyclerView
    lateinit var  layoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_list_fragment, container, false)

        recyclerView_list = view.findViewById(R.id.recyclerlist)
        layoutManager =  LinearLayoutManager(activity)
        return view
    }


}