package com.sayamphoo.enjoyreading.model

data class HomeDataViewItem (
    val type:Int?,
    val VPList:List<ViewPagersList>? = listOf(),
    val RVList:List<RecyclerList>? = listOf()
)

data class ViewPagersList(
    val list:Int? = null
)

data class RecyclerList(
    val list:Int? = null
)