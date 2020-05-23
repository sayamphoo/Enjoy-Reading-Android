package com.sayamphoo.enjoyreading.adapter.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.sayamphoo.enjoyreading.R

class HolderRecyclerHeader(itemView:View):RecyclerView.ViewHolder(itemView){
    val mViewPager: ViewPager2 = itemView.findViewById(R.id.adsViewPager)
}