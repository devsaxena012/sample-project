package com.example.sample_project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Recycler_Adapter(val postModel: MutableList<PostModel>) : RecyclerView.Adapter<Recycler_Adapter.listViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.recycler_single_row,parent,false)
        return listViewHolder(view)
    }

    override fun onBindViewHolder(holder: listViewHolder, position: Int) {
       return holder.bindView(postModel[position])

    }

    override fun getItemCount(): Int {
        return postModel.size
    }


    class listViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.name)
        val textView1: TextView = view.findViewById(R.id.subjects)
        val textView2: TextView = view.findViewById(R.id.qualification)
        val ImageView: ImageView = view.findViewById(R.id.profileImage)

        fun bindView(postModel: PostModel){
            textView.text = postModel.name
            textView1.text = postModel.subjects
            textView2.text = postModel.qualification
        }

    }
}