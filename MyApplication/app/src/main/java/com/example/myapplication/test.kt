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
}