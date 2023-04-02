package com.example.myapplication

fun main() {
    val trafficLightColor = "2";

    if (trafficLightColor == "Red") {
        println("stop")
    } else if (trafficLightColor == "Yellow") {
        println("slow")
    } else if (trafficLightColor == "Green") {
        println("go")
    } else {
        println("Invalid inputting ")
    }
}