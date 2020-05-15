package com.sayamphoo.enjoyreading.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.model.MeItem

class MeRecAdapter(
    private val item: ArrayList<MeItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return item[position].type!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            0 -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_profile_me, parent, false)
                Holder0(view)
            }

            1 -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_coins_me, parent, false)
                Holder1(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_menu_me, parent, false)
                Holder1(view)
            }
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            0 -> {
                holder as Holder0
            }

            1 -> {
                holder as Holder1
            }

            else -> {
                holder as Holder1
                holder.name.text = item[position].menu.nameList
                holder.icon.setImageResource(item[position].menu.iconList!!)

            }
        }
    }

    class Holder0(item: View) : RecyclerView.ViewHolder(item) {
        init {
            item.setOnClickListener {
                Toast.makeText(itemView.context, "mmm", Toast.LENGTH_LONG).show()
            }
        }
    }

    class Holder1(item: View) : RecyclerView.ViewHolder(item) {
        val name = item.findViewById<TextView>(R.id.name)
        val icon = item.findViewById<ImageView>(R.id.iconMenu)
    }

}