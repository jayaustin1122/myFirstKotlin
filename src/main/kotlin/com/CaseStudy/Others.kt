package com.CaseStudy

interface Others {
    open fun schedule(schedule:String){
        println("Schedule is: $schedule")
    }
    open fun department(dept:String){
        println("Department: $dept")
    }
}