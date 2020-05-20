package com.sayamphoo.enjoyreading.adapter.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.model.HomeDataViewItem

class HomeRecyclerAdapter(private val itemData: ArrayList<HomeDataViewItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return itemData[position].type!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            0 -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_header_home, parent, false)
                return HolderRecyclerHeader(view)
            }
            1 -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_list_home, parent, false)
                return HolderRecyclerList(view)
            }
            else -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_profile_me, parent, false)
                return HolderRecymclerHeader(view)
            }
        }
    }

    override fun getItemCount(): Int {
        return itemData.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            0 -> {
                holder as HolderRecyclerHeader
                holder.mViewPager.adapter = HomeViewPagerAdapter(itemData[position].VPList!!.list)
            }
            1 -> {
                holder as HolderRecyclerList
                holder.listRecycler.layoutManager = LinearLayoutManager(holder.itemView.context,LinearLayoutManager.HORIZONTAL ,false
                )
                holder.listRecycler.adapter = HomeRecycleAdapterRecycle()
            }
            else -> {
                holder as HolderRecymclerHeader
            }
        }
    }

    class HolderRecymclerHeader(item: View) : RecyclerView.ViewHolder(item) {

    }
}