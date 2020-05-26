package com.sayamphoo.enjoyreading.adapter.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.model.ViewPagersList
import com.squareup.picasso.Picasso

class HomeViewPagerAdapter(private val list: List<ViewPagersList>) :
    RecyclerView.Adapter<HomeViewPagerAdapter.ViewHolder>() {

    val vv = arrayOf(
        "https://www.jamsai.com/wp-content/uploads/2017/04/%E0%B8%A5%E0%B9%89%E0%B8%A7%E0%B8%87%E0%B8%A5%E0%B8%B6%E0%B8%81%E0%B8%99%E0%B8%B1%E0%B8%81%E0%B9%80%E0%B8%82%E0%B8%B5%E0%B8%A2%E0%B8%99%E0%B8%99%E0%B8%B4%E0%B8%A2%E0%B8%B2%E0%B8%A2%E0%B8%A7%E0%B8%B2%E0%B8%A2_03-1000x600.jpg",
        "https://www.jamsai.com/wp-content/uploads/2017/12/a-peace-of-cake1.jpg"
    )

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val mImage: ImageView = item.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_viewpager_home_recycler, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Picasso.get().load(vv[position]).into(holder.mImage)
    }


}