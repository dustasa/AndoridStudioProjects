package com.example.myapplication

fun main() {
    val trafficLightColor = "Red"

//    if (trafficLightColor == "Red") {
//        println("stop")
//    } else if (trafficLightColor == "Yellow") {
//        println("slow")
//    } else if (trafficLightColor == "Green") {
//        println("go")
//    } else {
//        println("Invalid inputting ")
//    }

    when(trafficLightColor) {
        "Red" ->  println("stop")
        "Yellow" -> println("slow")
        "Green" -> println("go")
        else -> println("Invalid inputting")
    }

    val x = 4

    when(x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a prime number between 1 and 10.but not a prime number.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}