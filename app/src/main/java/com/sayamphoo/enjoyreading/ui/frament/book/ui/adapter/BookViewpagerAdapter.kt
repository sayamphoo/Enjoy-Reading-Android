package com.sayamphoo.enjoyreading.ui.frament.book.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sayamphoo.enjoyreading.ui.enum.TabbarListEnum
import com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.action.ActionFragment
import com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.all.AllFragment
import com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.comedy.ComedyFragment
import com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.fantasy.FantasyFragment
import com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.romance.RomanceFragment
import com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.science.ScienceFragment

class BookViewpagerAdapter(
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