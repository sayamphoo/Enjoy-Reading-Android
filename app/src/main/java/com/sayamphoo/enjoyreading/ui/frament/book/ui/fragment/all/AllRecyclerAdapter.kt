package com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.all

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.modle.BookDataModle
import com.squareup.picasso.Picasso

class AllRecyclerAdapter (private val dataView:ArrayList<BookDataModle>) : RecyclerView.Adapter<AllRecyclerAdapter.ViewHodle>() {

    class ViewHodle(item: View):RecyclerView.ViewHolder(item) {
        val mImagelist: ImageView = item.findViewById(R.id.imagelist)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHodle {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book_list,parent,false)
        return ViewHodle(
            view
        )
    }

    override fun getItemCount(): Int {
       return dataView.size
    }

    override fun onBindViewHolder(holder: ViewHodle, position: Int) {
       Picasso.get().load(dataView[position].img).into(holder.mImagelist)
    }
}