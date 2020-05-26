package com.sayamphoo.enjoyreading.adapter.me

import android.transition.CircularPropagation
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.item_profile_me.view.*

class HolderProfile(item: View) : RecyclerView.ViewHolder(item){
    val profile = item.findViewById<CircleImageView>(R.id.profile)
}