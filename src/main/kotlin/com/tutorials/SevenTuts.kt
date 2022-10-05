package com.tutorials

fun main (){

// while loops
//    var counter = 1

//    while (counter<=5){
//        println("Helloworld")
//        counter++

        //do while loop
//        var counter  = 1
//    do {
//        println("hahaha")
//        counter++//execution
//    }while (counter <= 5)//condition
//nested loop
    var counter = 1
    while (counter <=5) {
        var counter1: Int = 1
        while (counter1 <= 5) {
            print("A")
            counter1++
        }
        println()
        counter++
    }
}