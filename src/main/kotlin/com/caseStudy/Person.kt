package com.caseStudy

open class Person {
    var fullName = ""
    var age = 0
    var type = ""
    var address = ""
    open fun displayDetails(fullname:String,age:Int,idNumber: Int,type:String){
        var newFullname = fullname
        var newAge =age
        var newIdNumber = idNumber
        var newType = type

        println("Full Name: $newFullname\n" +
                "Age: $newAge\n" +
                "ID: $newIdNumber\n" +
                "Type: $newType")
    }

}