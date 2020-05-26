package com.sayamphoo.enjoyreading.adapter.me

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.model.MeDataViewItem
import com.squareup.picasso.Picasso

class MeRecAdapter(private val dataViewItem: ArrayList<MeDataViewItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return dataViewItem[position].type!!
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
        return dataViewItem.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            0 -> {
                holder as HolderProfile
                Picasso.get().load("https://scontent.fbkk12-2.fna.fbcdn.net/v/t1.0-9/90950832_201496447952954_7997031648325533696_o.jpg?_nc_cat=105&_nc_sid=85a577&_nc_eui2=AeGLQ02fVRQbbMN-A1tRr0eb1BYgWYONqzrUFiBZg42rOnsGj_y-23qLM7yzxDVUCJJgEPp7__O5t2316M45oX5s&_nc_ohc=ELKQNczBW8MAX9yJ5la&_nc_ht=scontent.fbkk12-2.fna&oh=fef778a714f4b67ee07b289bd591e17b&oe=5EECCF16&dl=1").into(holder.profile)
            }
            1 -> {
                holder as HolderCoin
            }
            else -> {
                holder as HolderMenu
                holder.mName.text = dataViewItem[position].menu.nameList
                holder.mIcon.setImageResource(dataViewItem[position].menu.iconList!!)

            }
        }
    }

}