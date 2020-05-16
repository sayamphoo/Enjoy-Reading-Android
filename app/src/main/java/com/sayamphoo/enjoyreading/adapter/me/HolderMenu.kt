package com.sayamphoo.enjoyreading.adapter.me

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R

class HolderMenu(item: View) : RecyclerView.ViewHolder(item) {
    val name = item.findViewById<TextView>(R.id.name)
    val icon = item.findViewById<ImageView>(R.id.iconMenu)

    init {
        item.setOnClickListener {
            Toast.makeText(item.context,"--++ ", Toast.LENGTH_LONG).show()
        }
    }
}