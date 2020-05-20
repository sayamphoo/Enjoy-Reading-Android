package com.sayamphoo.enjoyreading.adapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R

class HomeRecycleAdapterRecycle () :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_home,parent,false)
        return HolderRecycleInRecycleView(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }


}