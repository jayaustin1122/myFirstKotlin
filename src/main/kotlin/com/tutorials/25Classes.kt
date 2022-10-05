package com.tutorials

fun main(){

}
//com.tutorials.Empty class
class Empty

//Nested class cannot access the inner class
class Outer{
    val name = "com.tutorials.Outer"
    fun show() = "The name: $name"

    class  Nested{
        val name = "Nested"
        fun show() = "The name is $name"
    }
}

//Inner class can access the inner class vise versa
class Outer2{
    val name1 = "com.tutorials.Outer2"
    fun show() = "The name: $name1"

    inner class  Nested {
        val name2 = "Inner"
        fun show() = "Data: $name1 and $name2"
    }
}
//Sealed Class
//Open Class
//Abstract Class
//Data class