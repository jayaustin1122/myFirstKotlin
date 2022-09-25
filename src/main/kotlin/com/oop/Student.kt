package com.oop
//inheritance
class Student(_studentId:Int) : Person() {
    var studentId = _studentId

    fun displayStudentId(){
        println(studentId)

    }

    override fun displayName() {
        super.displayName()// overiding or changing the value of the super class.
        println("Displayin subclass student $name")

    }
}