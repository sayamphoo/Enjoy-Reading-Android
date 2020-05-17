package com.sayamphoo.enjoyreading.adapter.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R

class HomeViewPagerAdapter(private val list: ArrayList<Int>) : RecyclerView.Adapter<HomeViewPagerAdapter.ViewHolder>() {

    class ViewHolder(item:View) : RecyclerView.ViewHolder(item) {
        val vv = item.findViewById<ImageView>(R.id.Ddees)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_test,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return 2
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.vv.setImageResource(list[position])
    }


}