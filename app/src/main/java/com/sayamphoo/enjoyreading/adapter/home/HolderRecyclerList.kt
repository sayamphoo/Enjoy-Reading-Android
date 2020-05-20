package com.sayamphoo.enjoyreading.adapter.home

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R

class HolderRecyclerList (item:View) : RecyclerView.ViewHolder(item) {
val listRecycler: RecyclerView = item.findViewById(R.id.itemRecyclerHome)
}