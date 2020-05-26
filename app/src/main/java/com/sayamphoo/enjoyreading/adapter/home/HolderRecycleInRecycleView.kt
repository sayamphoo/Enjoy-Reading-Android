package com.sayamphoo.enjoyreading.adapter.home

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R

class HolderRecycleInRecycleView(item:View) : RecyclerView.ViewHolder(item) {
    val imgList = item.findViewById<ImageView>(R.id.imagelist)
}