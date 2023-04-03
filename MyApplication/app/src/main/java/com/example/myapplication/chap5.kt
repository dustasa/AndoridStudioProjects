package com.example.myapplication

// 智能设备都有不同的功能，但也有一些共同的特性
// 可以将这些通用特性复制到每个智能设备类中
// 也可以用继承的方式让代码可重复使用

open class SmartDevice3 (val name: String, val category: String ) {
    // superclass parent
    // 引入open关键词用于继承扩展

}

class SmartTVDevice (deviceName: String, deviceCategory: String)
    : SmartDevice3(name = deviceName, category = deviceCategory) {
    // SmartTvDevice 的 constructor 定义没有指定属性是可变的还是不可变的
    // deviceName 和 deviceCategory 形参只是 constructor 形参，而不是类属性。
    // 在类中无法使用这些形参，只能将其传递给父类构造函数

    var speakerVolume: Int = 2
        set(value) {
            if (value in 1..100) {
                field = value
            }
        }


    var channelNumber: Int = 1
        set(value) {
            if (value in 1..200) {
                field = value
            }
        }

    // 定义会调高音量并输出 "Speaker volume increased to $speakerVolume."
    // 字符串的 increaseSpeakerVolume() 方法
    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    // 添加会增加频道号并输出 "Channel number increased to $channelNumber." 字符串的 nextChannel()
    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }
}

fun main() {
    val smartTV = SmartTVDevice(deviceName = "andorid TV", deviceCategory = "entertainment")

}
