package com.sayamphoo.enjoyreading.ui.frament.me.modle


data class MeDataViewItem(
    val type: Int?,
    val profile: Profile = Profile(),
    val coins: Coins = Coins(),
    val menu: Menu = Menu()
)

data class Profile(
    val name: String? = "",
    val idName: String = ""
)

data class Coins(
    val coin: String? = ""
)

data class Menu(
    val nameList: String? = "",
    val iconList:Int? = 0
)