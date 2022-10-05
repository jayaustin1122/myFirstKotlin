package com.oop.sample

class Manager:Employee() {
    override fun computeBonus(){
        var result :Double = (bunos*0.10)+bunos
        println("Manager Bonus is $result")
    }
    override fun displaySalary(){
        var result = super.salary + 1000
        println("Salary is $result with Encentives")
    }
}