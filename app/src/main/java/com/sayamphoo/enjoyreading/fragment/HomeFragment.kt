package com.sayamphoo.enjoyreading.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.adapter.home.HomeRecyclerAdapter
import com.sayamphoo.enjoyreading.model.HomeDataViewItem
import com.sayamphoo.enjoyreading.model.ViewPagers
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val item = ArrayList<HomeDataViewItem>()

        val data = arrayListOf(
            R.drawable.ic_account,
            R.drawable.ic_logout
        )

        item.add(HomeDataViewItem(0, view = ViewPagers(data)))

        homeRecycler.layoutManager = LinearLayoutManager(activity)
        homeRecycler.adapter = HomeRecyclerAdapter(item)
    }
}

