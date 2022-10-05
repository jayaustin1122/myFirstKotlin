package com.tutorials

fun main(){
//    //Objects
//    var joe = com.tutorials.Person()
//    //re assigning value
//    joe.name = "Joe"
//    //calling object
//    println(joe.name)//joe
//
//    var ana = com.tutorials.Person()
//    println(ana.name)
    var joe = Person("Joe",21)


}
//class
class Person1(var name:String,var age :Int) {    //constructor
    //Attributes
//    var name: String = "John"
//    var age: Int = 21
    //Behaviors
    fun walk(){
        println("A com.tutorials.Person Walks")
    }
    fun eat(){
        println("A com.tutorials.Person Eats")
    }
}