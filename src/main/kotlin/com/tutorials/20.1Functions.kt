package com.tutorials

fun main (){
    var result = cube(2)
    println(result)
    println(add(2,3))
}
//-----------------------------------------------
//with return, 1parameter
//- is only say that int only.
fun cube (number:Int):Int{
    var computeCube = number * number * number
    return computeCube
}
//---------------------------------------------
//with return, 2 parameter
//- is only say that int only.
fun add (number1:Int,number2:Int):Int {
    println("Result")
    return number1 + number2

}