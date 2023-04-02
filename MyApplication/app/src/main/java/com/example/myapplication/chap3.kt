package com.example.myapplication

// 类名称采用 PascalCase 大小写形式编写，因此每个单词都以大写字母开头，且各个单词之间没有空格。
// 以“SmartDevice”为例，每个单词的第一个字母都大写，且单词之间没有空格。
// 属性：用于指定类对象属性的变量。
// 方法：包含类的行为和操作的函数。
// 构造函数：一种特殊的成员函数，用于在定义类的整个程序中创建类的实例。

class SmartDevice() {
    // empty body
    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {
    val number : Int = 1
    val smartTvDevice = SmartDevice()
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}