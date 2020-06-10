package com.sayamphoo.enjoyreading.ui.frament.home.ui.adapter.recycle

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import com.squareup.picasso.Picasso

class HomeRecycleAdapterRecycle () :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_home_infor,parent,false)
        return HolderRecycleInRecycleView(
            view
        )
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as HolderRecycleInRecycleView
        Picasso.get().load("https://i.pinimg.com/564x/67/dc/3f/67dc3f37a925e4563962687a784a6b62.jpg").into(holder.imgList)
    }


}