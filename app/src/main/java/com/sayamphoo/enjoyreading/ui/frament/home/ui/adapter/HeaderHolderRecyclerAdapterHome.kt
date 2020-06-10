package com.sayamphoo.enjoyreading.ui.frament.home.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.sayamphoo.enjoyreading.R

class HeaderHolderRecyclerAdapterHome(itemView:View):RecyclerView.ViewHolder(itemView){
    val mViewPager: ViewPager2 = itemView.findViewById(R.id.adsViewPager)
}