package com.sayamphoo.enjoyreading.adapter.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.sayamphoo.enjoyreading.R

class HolderHeader(itemView:View):RecyclerView.ViewHolder(itemView){
    val viewPager = itemView.findViewById<ViewPager2>(R.id.Ddee)
}