package com.tutorials

fun main() {
    print("Choose Product\n[1]Hotdog\n[2]Footlong\n[3]Tucino\n Select: ")
    var num: Int = readln().toInt()
    when (num) {
        1 -> print("You purchased hotdog")
        2 -> print("You purchased footlong")
        3 -> print("You purchased tucino")
        else -> print("INVALID ITEM")

    }
}