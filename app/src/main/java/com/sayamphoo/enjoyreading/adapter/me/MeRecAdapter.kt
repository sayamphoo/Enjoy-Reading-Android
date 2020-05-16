package com.sayamphoo.enjoyreading.adapter.me

import android.view.LayoutInflater
import android.view.ViewGroup
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
                HolderProfile(view)
            }

            1 -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_coins_me, parent, false)
                HolderCoin(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_menu_me, parent, false)
                HolderMenu(view)
            }
        }
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            0 -> { holder as HolderProfile }
            1 -> {holder as HolderCoin}
            else -> {
                holder as HolderMenu
                holder.name.text = item[position].menu.nameList
                holder.icon.setImageResource(item[position].menu.iconList!!)

            }
        }
    }

}