package com.sayamphoo.enjoyreading.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.adapter.book.ViewPagerAdapter
import com.sayamphoo.enjoyreading.enum.TabbarListEnum
import kotlinx.android.synthetic.main.fragment_books.*

class BooksFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_books, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        bookViewPager.adapter = ViewPagerAdapter(fragmentManager!!, lifecycle)

        TabLayoutMediator(tabBookLayout, bookViewPager) { tab, position ->
                tab.text = TabbarListEnum.values()[position].getName()
        }.attach()
    }


}
