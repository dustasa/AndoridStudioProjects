package com.example.myapplication

fun main() {
    val trafficLightColor = "Red"

    // 将if语句转化成表达式
//    val message  =
//        if (trafficLightColor == "Red") "stop"
//        else if (trafficLightColor == "Yellow") "slow"
//        else if (trafficLightColor == "Green") "go"
//        else "Invalid inputting "
//    println(message)


//    when(trafficLightColor) {
//        "Red" ->  println("stop")
//        "Yellow" -> println("slow")
//        "Green" -> println("go")
//        else -> println("Invalid inputting")
//    }
    // 将when语句转化成表达式
    // 在大多数情况下，when 表达式需要 else 分支
    val message =
        when(trafficLightColor) {
            "Red" ->  "stop"
            "Yellow" -> "slow"
            "Green" -> "go"
            else -> "Invalid inputting"
        }
    println(message)

    val x:Any = 20 //Any声明x可为任意类型变量，而不是局限int

    when(x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a prime number between 1 and 10.but not a prime number.")
        is Int -> println("x is a integer number, but not a prime number.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}