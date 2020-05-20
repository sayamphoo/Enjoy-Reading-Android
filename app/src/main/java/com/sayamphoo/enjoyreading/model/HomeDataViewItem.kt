package com.sayamphoo.enjoyreading.model

data class HomeDataViewItem (
    val type:Int? = 0,
    val VPList:ViewPagersList? = ViewPagersList(),
    val RVList:RecyclerList? = RecyclerList()
)

data class ViewPagersList(
    val list: ArrayList<Int> = ArrayList()
)

data class RecyclerList(
    val list: ArrayList<Int> = ArrayList()
)