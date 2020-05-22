package com.sayamphoo.enjoyreading.enum

enum class TabbarListEnum(private val nameTh:String,private val numberType:Int){
    All("ทั้งหมด",0),
    Comedy("ตลกขบขัน",1),
    Action("ต่อสู้",2),
    Romance("รักโรแมนติก",3),
    Science("วิทยาศาสตร์",4),
    Fantasy("แฟนตาซี",5);

    fun getName(): String {
        return nameTh
    }

    fun getNumber():Int{
        return numberType
    }
}