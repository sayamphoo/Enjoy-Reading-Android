package com.sayamphoo.enjoyreading.adapter.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.model.HomeDataViewItem

class HomeRecyclerAdapter(val item: ArrayList<HomeDataViewItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_header_home, parent, false)
        return HolderHeader(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as HolderHeader
        holder.viewPager.adapter = HomeViewPagerAdapter(item[0].view!!.list)
    }

}