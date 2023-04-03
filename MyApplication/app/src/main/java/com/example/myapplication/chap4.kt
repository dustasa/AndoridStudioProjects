package com.example.myapplication

// 默认构造函数不含形参。定义默认构造函数的做法如以下
// 在 SmartDevice 类中，将 name 和 category 属性移至构造函数中，且不赋予默认
// 辅助构造函数声明：辅助构造函数定义以 constructor 关键字开头，后跟圆括号。
// 可视情况在圆括号中包含辅助构造函数所需的形参。
// 主要构造函数初始化：初始化以冒号开头，后面依次跟 this 关键字和一对圆括号。
// 可视情况在圆括号中包含主要构造函数所需的形参。
// 辅助构造函数主体：在主要构造函数的初始化后跟一对大括号，其中包含辅助构造函数的主体。
class SmartDevice2 constructor(val name : String, val category: String) {
    var deviceStatus = "online"
    // 假设集成由智能设备提供商开发的 API
    // 该 API 会返回 Int 类型的状态代码来指明初始设备状态。
    // 如果设备处于离线状态，该 API 会返回 0 值；
    // 如果设备处于在线状态，则返回 1 值。
    // 对于任何其他整数值，系统会将状态视为“未知”。
    constructor(name: String, category: String, statusCode : Int) : this(name, category) {
        deviceStatus =
            when(statusCode) {
                0 -> "offline"
                1 -> "online"
                else -> "unknown"
            }
    }

    fun turnOn(){
        println("Smart device is turned on.")
    }

    fun turnOff(){
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTVDevice = SmartDevice2("android TV", "entertainment", statusCode = 1)

    println("smartTV status is: ${smartTVDevice.deviceStatus}")
}