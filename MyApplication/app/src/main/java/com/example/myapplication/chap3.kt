package com.example.myapplication

// 类名称采用 PascalCase 大小写形式编写，因此每个单词都以大写字母开头，且各个单词之间没有空格。
// 以“SmartDevice”为例，每个单词的第一个字母都大写，且单词之间没有空格。
// 属性：用于指定类对象属性的变量。
// 方法：包含类的行为和操作的函数。
// 构造函数：一种特殊的成员函数，用于在定义类的整个程序中创建类的实例。

class SmartDevice() {
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

    // empty body
    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
    // 属性中的 getter 和 setter 函数
    // var name : datatype = init value
    // get () {
    //  body
    //  return statement }
    // set (value) {body}

    // 定义一个播放器音量1-10
    var speakerVolume : Int = 2
//        get() = field
        // 在 set() 函数中使用 in 关键字，并在后面加上值的范围，以检查 Int 值是否处于 0 到 100 的范围内
        // 如果该值在预期范围内，系统便会更新 field 值；否则，该属性的值保持不变
        set(value) {
            if (value in 1..100) {
                field = value
            }
        }
    // 不可变属性的完整语法有以下两处差异：
    // 以 val 关键字开头。
    // val 类型的变量为只读变量，因此不含 set() 函数。
}

fun main() {
    val number : Int = 1
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    println("SpeakerVolume is: ${smartTvDevice.speakerVolume}")
    smartTvDevice.speakerVolume = 101
//    smartTvDevice.speakerVolume = 99
    println("SpeakerVolume is: ${smartTvDevice.speakerVolume}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}