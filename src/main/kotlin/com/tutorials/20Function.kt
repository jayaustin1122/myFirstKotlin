package com.tutorials

fun main(){
    /*Functions build-in
    -println()
    -toInt()
    -readln()
    -com.tutorials.main()
     */

    diplayName()
    displayMessage("Hello")
    print("Enter Your Name: ")
    var name = readln()
    print("Enter Your Age: ")
    var age = readln().toInt()
    displayNameAndAge(name,age)
}
//---------------------------------------------------
//Making our function
//empty parameter /no return
                   //unit is return type  means no return types function. optional it works when blank.
fun diplayName():Unit{
    println("Peter")
}
//---------------------------------------------------
//another function with 1 parameters/ no return
fun displayMessage(msg:String){
    println("The message is $msg")
}
//-------------------------------------------------
//no return 2 parameters/ no return
fun displayNameAndAge(name:String,age:Int){
    println("Your name is $name")
    println("Your age is $age")

}