package com.sayamphoo.enjoyreading.adapter.book

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sayamphoo.enjoyreading.enum.TabbarListEnum
import com.sayamphoo.enjoyreading.fragment.book.*


class ViewPagerAdapter(
    private val fragmentManager: FragmentManager,
    private val lifecycle: Lifecycle
) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return TabbarListEnum.values().size
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            TabbarListEnum.All.getNumber() -> {
                AllFragment()
            }
            TabbarListEnum.Comedy.getNumber() -> {
                ActionFragment()
            }
            TabbarListEnum.Action.getNumber() -> {
                RomanceFragment()
            }
            TabbarListEnum.Romance.getNumber() -> {
                ScienceFragment()
            }
            TabbarListEnum.Science.getNumber() -> {
                FantasyFragment()
            }
            TabbarListEnum.Fantasy.getNumber() -> {
                ComedyFragment()
            }
            else -> {
                AllFragment()
            }
        }
    }
}