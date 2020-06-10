package com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.all

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.modle.BookDataModle
import kotlinx.android.synthetic.main.fragment_all_book.*

class AllFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_all_book, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val datas = ArrayList<BookDataModle>()

        for(i in 0..60) {
            datas.add(BookDataModle("https://i.pinimg.com/564x/67/dc/3f/67dc3f37a925e4563962687a784a6b62.jpg"))
        }

        bookListAll.layoutManager = GridLayoutManager(activity,20)
        bookListAll.adapter =
            AllRecyclerAdapter(datas)
    }

}
