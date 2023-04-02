package com.example.myapplication

fun main() {
//    val favoriteActor = null
//    val favoriteActor = "ZhangYi"

    // 使用 var 关键字定义的变量重新赋予相同类型的不同值
    // String 数据属于不可为 null 类型，因此您无法为该变量重新赋予 null
    // 在 Kotlin 中声明可为 null 的变量，您需要在相应类型的末尾添加 ? 运算符
    var favoriteActor:String ?= "ZhangYi"
    favoriteActor = "zhaojinmai"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}