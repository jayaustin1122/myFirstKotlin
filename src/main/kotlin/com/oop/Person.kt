package com.oop
open class Person {
    //Abstraction - naka tago
    //Encapsulation
    var name: String = "John"
        get() { return field }
        set(value) {
            field = value
        }
    var age : Int = 23
        get() { return field }
        set(value) {
            //creating validation
            if (value <1){
                println("Invalid Age!")
            }else
                field = value
        }
    init {
        println("Object Created!")
        println("Name is $name, age is $age")
    }
    fun upAgee():Int{//int is the return type
        age++
        return age
    }
    fun change(age:Int){
        println(age)
    }
    open fun displayName(){
        println("Super class variable name is $name")
    }


}