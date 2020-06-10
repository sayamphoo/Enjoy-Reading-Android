package com.sayamphoo.enjoyreading.ui.frament.home.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.ui.frament.home.ui.modle.HomeDataViewItem
import com.sayamphoo.enjoyreading.ui.frament.home.ui.adapter.recycle.HomeRecycleAdapterRecycle
import com.sayamphoo.enjoyreading.ui.frament.home.ui.adapter.viewpager.HomeViewpagerAdapter

class HomeRecyclerAdapter(private val itemData: List<HomeDataViewItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return itemData[position].type!!
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            0 -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_ads, parent, false)
                return HeaderHolderRecyclerAdapterHome(
                    view
                )
            }
            1 -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_list_home, parent, false)
                return ListHolderRecyclerAdapterHome(
                    view
                )
            }
            else -> {
                val view =
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.item_profile_me, parent, false)
                return HolderRecymclerHeader(
                    view
                )
            }
        }
    }

    override fun getItemCount(): Int {
        return itemData.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            0 -> {
                holder as HeaderHolderRecyclerAdapterHome
                holder.mViewPager.adapter =
                    HomeViewpagerAdapter(
                        itemData[position].VPList!!
                    )
            }
            1 -> {
                holder as ListHolderRecyclerAdapterHome

                holder.listRecycler.apply {
                    layoutManager = LinearLayoutManager(holder.itemView.context,
                        LinearLayoutManager.HORIZONTAL, false)
                    holder.listRecycler.adapter =
                        HomeRecycleAdapterRecycle()
                }
            }
            else -> {
                holder as HolderRecymclerHeader
            }
        }
    }

    class HolderRecymclerHeader(item: View) : RecyclerView.ViewHolder(item) {

    }
}