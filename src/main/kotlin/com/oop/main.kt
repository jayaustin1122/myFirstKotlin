package com.oop
fun main(){
    //calling abstraction and encapsulation
//    var joePerson = Person()
//    joePerson.name = "Peter"
//    println(joePerson.name)
//    joePerson.age = -1
//    println("HelloWorld")
    //calling the subclass student
    var joeStudent = Student(1212)
    println( joeStudent.name)
    joeStudent.age = -1
    joeStudent.displayStudentId()
}