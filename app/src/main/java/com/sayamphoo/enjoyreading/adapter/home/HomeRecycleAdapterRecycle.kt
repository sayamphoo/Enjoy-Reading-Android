package com.sayamphoo.enjoyreading.adapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import com.squareup.picasso.Picasso

class HomeRecycleAdapterRecycle () :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_home_infor,parent,false)
        return HolderRecycleInRecycleView(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as HolderRecycleInRecycleView
        Picasso.get().load("https://teen.mthai.com/app/uploads/2012/09/%E0%B8%99%E0%B8%B4%E0%B8%A2%E0%B8%B2%E0%B8%A21.jpg").into(holder.imgList)
    }


}