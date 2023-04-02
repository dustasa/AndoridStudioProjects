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

    val x = 3
    when(x) {
        2 -> println("x is a prime number between 1 and 10.")
        3 -> println("x is a prime number between 1 and 10.")
        5 -> println("x is a prime number between 1 and 10.")
        7 -> println("x is a prime number between 1 and 10.")
        else -> println("x isn't a prime number between 1 and 10.")
    }
}