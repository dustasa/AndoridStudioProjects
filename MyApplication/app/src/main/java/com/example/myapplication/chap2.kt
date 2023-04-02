package com.example.myapplication

fun main() {
//    val favoriteActor = null
//    val favoriteActor = "ZhangYi"

    // 使用 var 关键字定义的变量重新赋予相同类型的不同值
    // String 数据属于不可为 null 类型，因此您无法为该变量重新赋予 null
    // 在 Kotlin 中声明可为 null 的变量，您需要在相应类型的末尾添加 ? 运算符
    var favoriteActor: String? = "ZhangYi"
    favoriteActor = "zhaojinmai"
    println(favoriteActor)
    println(favoriteActor.length)
    favoriteActor = null
    println(favoriteActor)
    // Int type var
    var number:Int ?= 1
    println(number)
    number = 10
    println(number)

    var favoriteActor2: String? = "Sandra Oh"
//    println(favoriteActor2.length)
    // 使用 ?. 安全调用运算符访问方法或属性
    // 在变量名称后面添加 ? 符号
    // 并使用 . 表示法访问方法或属性
    println(favoriteActor2?.length)
    // 尝试访问 null 变量的 length 属性，该程序也不会崩溃。
    // 安全调用表达式只会返回 null。
    favoriteActor2 = null
    println(favoriteActor2?.length)
    // 使用 !! 非 null 断言运算符
    var favoriteActor3: String? = "Sandra Oh"
//    println("favoriteActor3.length"+ favoriteActor3.length)
//    println("favoriteActor3?.length" + favoriteActor3?.length)
//    println("favoriteActor3!!.length" + favoriteActor3!!.length)

//    favoriteActor3 = null
//    println("favoriteActor3.length"+ favoriteActor3.length)
//    println("favoriteActor3?.length" + favoriteActor3?.length)
//    println("favoriteActor3!!.length" + favoriteActor3!!.length)

    // if/else， 引入null检查
//    val lengthOfNumber =
//        if (favoriteActor3 != null) {
//        println("The number of characters in your favorite actor's name " +
//                "is ${favoriteActor3.length}.")
//        } else {
//            println("favoriteActor3 is null")
//        }

    val lengthOfName =
        if (favoriteActor3 != null) favoriteActor3.length
        else 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}