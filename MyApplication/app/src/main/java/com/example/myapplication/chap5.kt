package com.example.myapplication

// 智能设备都有不同的功能，但也有一些共同的特性
// 可以将这些通用特性复制到每个智能设备类中
// 也可以用继承的方式让代码可重复使用

open class SmartDevice3 (val name: String, val category: String ) {
    // superclass parent
    // 引入open关键词用于继承扩展
    // 将可重复使用的代码从 SmartTvDevice 和 SmartLightDevice 子类移至 SmartDevice 父类
    var deviceStatus = "online"
    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}

// 智能电视设备
// IS-A 关系
// Smart TV IS-A smart device.
// 在 SmartDevice 父类和 SmartTvDevice 子类之间指定 IS-A 关系，
// 即表示 SmartDevice 父类可以执行的操作，SmartTvDevice 子类也可执行。
// 这种关系是单向的，因此可以说每个智能电视“都是”智能设备，但不能说每个智能设备“都是”智能电视。
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

    override fun turnOn() {
//        deviceStatus = "on"
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
//        deviceStatus = "off"
        println("$name is turn off")
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
// 智能台灯设备
class SmartLightDevice (deviceName: String, deviceCategory: String)
    : SmartDevice3(name = deviceName, category = deviceCategory) {

    var brightnessLevel = 0
        set(value) {
            if (value in 1..100) {
                field = value
            }
        }

    // 重写父类中的turnOn/Off方法
    override fun turnOn() {
//        deviceStatus = "on"
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")
    }

    override fun turnOff() {
//        deviceStatus = "off"
        super.turnOff()
        brightnessLevel = 0
        println("smart light device is off")
    }

    // 定义会调高灯具亮度并输出 "Brightness increased to $brightnessLevel."
    // 字符串的 increaseBrightness() 方法
    fun increaseBrightness() {
        brightnessLevel++
        print("Brightness increased to $brightnessLevel.")
    }


}

// HAS-A 关系是指定两个类之间的关系的另一种方式。例如，您可能要使用住宅中的智能电视。
// 在这种情况下，智能电视和住宅之间存在某种关系。
// 住宅中包含智能设备，即住宅“拥有”智能设备。两个类之间的 HAS-A 关系也称为“组合”
class SmartHome(val smartTVDevice: SmartTVDevice, val smartLightDevice: SmartLightDevice) {
    // 替换子类中的父类方法
    fun turnOnTv() {
        smartTVDevice.turnOn()
    }

    fun turnOffTv() {
        smartTVDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTVDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTVDevice.nextChannel()
    }

    fun turnOnLight() {
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}

fun main() {
//    val smartTV = SmartTVDevice(deviceName = "andorid TV", deviceCategory = "entertainment")
    var smartDevice: SmartDevice3 = SmartTVDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice(deviceName = "xiaomi light", deviceCategory = "light")
    smartDevice.turnOn()
}
