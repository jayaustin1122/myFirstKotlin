package com.tutorials

fun main(){
    //calling class
    var myObject1 = MyClass("Hello World")
    //using user input
    print("enter: ")
    var input = readln().toString()
    var myObject2 = MyClass(input)
    //calling generic class
    var myObject3 = MyGenrericClass(1234)// String or int or any data types.

}

//Sample class
class MyClass(variable: String){
    init {
        println(variable)
    }

}
//Generic class
class MyGenrericClass<T>(AnyVariable : T){
    init {
        println(AnyVariable.toString())
    }
}

