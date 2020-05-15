package com.sayamphoo.enjoyreading.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.sayamphoo.enjoyreading.ItemClickListener
import com.sayamphoo.enjoyreading.R
import com.sayamphoo.enjoyreading.adapter.MeRecAdapter
import com.sayamphoo.enjoyreading.model.*
import kotlinx.android.synthetic.main.fragment_me.*

class MeFragment : Fragment(), ItemClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_me, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val mMenuName = arrayListOf(
            "การตั้งงค่า",
            "เกียวกับ",
            "ออกจากระบบ"
        )

        val mMenuIcon = arrayListOf(
            R.drawable.ic_settings,
            R.drawable.ic_about,
            R.drawable.ic_logout
        )

        val items = ArrayList<MeItem>()

        items.add(MeItem(0, profile = Profile("sayamphoo", "id")))
        items.add(MeItem(1, coins = Coins("100")))

        for (i in 0..2) {
            items.add(MeItem(2, menu = Menu(mMenuName[i], mMenuIcon[i])))
        }




        meRecycler.layoutManager = LinearLayoutManager(activity)
        meRecycler.adapter = MeRecAdapter(items)
    }

    override fun onNoteClick(position: Int) {
        Toast.makeText(context, "000", Toast.LENGTH_LONG).show()
    }


}
