package com.sayamphoo.enjoyreading.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.adapter.home.HomeRecyclerAdapter
import com.sayamphoo.enjoyreading.model.HomeDataViewItem
import com.sayamphoo.enjoyreading.model.ViewPagersList
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

        homeRecycler.layoutManager = LinearLayoutManager(activity)
        homeRecycler.adapter = HomeRecyclerAdapter(testData())

    }

    private fun testData(): List<HomeDataViewItem> {
        val titles = listOf(
            R.drawable.ic_account,
            R.drawable.ic_logout
        )
        val mutableList = mutableListOf<HomeDataViewItem>()

        val VPList = mutableListOf<ViewPagersList>()

        for (i in titles) {
            VPList.add(ViewPagersList(i))
        }

        mutableList.add(HomeDataViewItem(0, VPList = VPList))
        mutableList.add(HomeDataViewItem(1))


        return mutableList
    }
}

