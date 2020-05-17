package com.sayamphoo.enjoyreading.model

data class HomeDataViewItem (
    val type:Int? = 0,
    val view:ViewPagers?
)

data class ViewPagers(
    val list: ArrayList<Int>
)