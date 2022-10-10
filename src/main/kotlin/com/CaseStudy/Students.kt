package com.CaseStudy

open class Students:Person(),OtherFuctions {
    init {
        println("---Students---")
    }
    fun course (course:String){
        println("Crouse is $course")
    }
}