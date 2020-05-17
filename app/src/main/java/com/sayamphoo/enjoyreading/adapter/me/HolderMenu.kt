package com.sayamphoo.enjoyreading.adapter.me

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R

class HolderMenu(item: View) : RecyclerView.ViewHolder(item) {
    val mName: TextView = item.findViewById(R.id.name)
    val mIcon: ImageView = item.findViewById(R.id.iconMenu)

    init {
        item.setOnClickListener {
            Toast.makeText(item.context,"--++ $item", Toast.LENGTH_LONG).show()
        }
    }
}