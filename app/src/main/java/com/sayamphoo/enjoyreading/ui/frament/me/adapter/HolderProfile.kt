package com.sayamphoo.enjoyreading.ui.frament.me.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import de.hdodenhof.circleimageview.CircleImageView

class HolderProfile(item: View) : RecyclerView.ViewHolder(item){
    val profile = item.findViewById<CircleImageView>(R.id.profile)
}