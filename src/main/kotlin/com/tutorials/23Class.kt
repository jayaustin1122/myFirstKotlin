package com.tutorials

fun main(){
    //Calling primary see the parameters to identify the first or
    // second constructor is used.
    var joe = Person("Joe",21)
    println("*************")
    println("${joe.name}'s current age is ${joe.name}")
    println("After 1 Year")
    joe.ageUp()
    println("${joe.name}'s current age is ${joe.name}")
    //calling second constructor
    var anne = Person("Anne")
    anne.age = 25
    anne.displayAge()
}
class Person(var name: String ,var age :Int){//Primary Constructor
    init {
        println("Object Created")
        println("Name is $name")
        println("Age is $age")
    }
    //Secondary Constructor
    constructor(name:String):this(name,0){}
    constructor(age:Int):this("default_name",age){}
    fun walk(){
        println("A com.tutorials.Person Walks")
    }
    fun eat(){
        println("A com.tutorials.Person Eats")
    }
    fun displayAge(){
        //var age = 7
        println(age)
    }
    fun ageUp(){
        age++
    }
}