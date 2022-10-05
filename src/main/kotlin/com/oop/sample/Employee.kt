package com.oop.sample

open class Employee {
    var salary: Double = 3000.0
    var bunos : Double = 1000.0

    init {
        println("New Employee Created.")
    }
    open fun computeBonus(){
        println("Staff Bonus is $bunos")
    }
    open fun displaySalary(){
        println("Salary is $salary")
    }
}
