package com.example.myapplication

fun main() {
//    val favoriteActor = null
//    val favoriteActor = "ZhangYi"

    // 使用 var 关键字定义的变量重新赋予相同类型的不同值
    // String 数据属于不可为 null 类型，因此您无法为该变量重新赋予 null
    var favoriteActor:String = "ZhangYi"
    favoriteActor = null

    println(favoriteActor)
}